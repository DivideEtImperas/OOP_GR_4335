package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import Controller.iGetModel;

public class FileModel implements iGetModel {
    
  private String fileName;
/**
 * К-ор класса FileModel
 * @param fileName инициализация файла
 */
  public FileModel(String fileName) {
      this.fileName = fileName;

      try(FileWriter fw = new FileWriter(fileName, true))
      {
          fw.flush();    
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  }
 // метод для получения студентов из файла
  @Override
  public HashMap<Long,Student> getAllStudents() {
      HashMap<Long,Student> students  = new HashMap<Long,Student>();
      try
      {
          File file = new File(fileName);
          FileReader fr = new FileReader(file);
          BufferedReader reader = new BufferedReader(fr);
          String line = reader.readLine();
          while(line!=null)
          {
              String[] param = line.split(" ");
              Student pers = new Student(Integer.parseInt(param[2]), param[1], param[0], Integer.parseInt(param[3]));
              students.put((long) pers.getId(), pers); 
              line = reader.readLine();
              
          }   
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      return students;
  }
  // метод для сохранения студентов в файл
  public void saveAllStudentToFile(HashMap<Long,Student> students)
  {
      try(FileWriter fw = new FileWriter(fileName, true))
      {
          for(Map.Entry<Long,Student> m: students.entrySet())
          {
              fw.write(m.getKey() + " : " + m.getValue());
              fw.append('\n');
          }
          fw.flush();    
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  }
// Метод удаления студента по ключу
@Override
public void deleteStudent(HashMap<Long, Student> students, Long number) {
    students.remove(number);
}
}
