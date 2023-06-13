package Controller;

import java.util.HashMap;

import Model.FileModel;
import Model.Student;

public class Controller {

  private iGetView view;
  private iGetModel model;
  private HashMap<Long,Student> students;
/**
 * К-ор класса Controller
 * @param view интерфейс View
 * @param model интерфейс Model
 * @param students словарь студентов 
 */
  public Controller(iGetView view, iGetModel model) {
      this.view = view;
      this.model = model;
      this.students = new HashMap<Long,Student>();
  }
// получает всех студентов
public void getAllStudents() {
      students = model.getAllStudents();
  }
// возвращает true если в словаре есть данные
  public boolean testData() {
      if (students.size() > 0) {
          return true;
      } else {
          return false;
      }
  }
  // обновляет список
  public void update() {
      //MVP
      getAllStudents();
      if(testData())
      {
          view.printAllStudents(students);
      }
      else{
          System.out.println("Список студентов пуст!");
      }

      //MVC
      //view.printAllStudents(model.getAllStudents());
  }
 // запуск программы
  public void run()
  {
      Commands com = Commands.NONE;
      boolean getNewIteration = true;
      Long num;
      while(getNewIteration)
      {
        // System.out.println("Выберете язык! 1-ru 2-eng");
        // switch () {
        //     case 1:
                
        //         break;
        
        //     default:
        //         break;
        // }
          view.printCommands();
          String command = view.promptEng("Enter the command: ");
          com = Commands.valueOf(command.toUpperCase());
          switch(com)
          {
              case EXIT:
                  getNewIteration=false;
                  command = view.promptEng("Exit the program!");
                  break;
              case READ:
                  getAllStudents();
                  break;        
              case LIST:
                  getAllStudents();
                  view.printAllStudents(students);
                  break;
              case DELETE:
                  getAllStudents();
                  view.printAllStudents(students);
                  num = view.number("Enter the student id to delete: ");
                  model.deleteStudent(students,num);
                  view.printAllStudents(students);
                  break;
              case UPDATE:
                  update();
                  break;
              case WRITE:
                  getAllStudents();
                  FileModel fModel = new FileModel("StudentsBD");
                  fModel.saveAllStudentToFile(students);
                  break;
          }

      }
  }


}
