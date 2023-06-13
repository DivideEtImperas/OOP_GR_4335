
import java.util.HashMap;
import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.Student;
import View.View;


public class App {
    public static void main(String[] args) throws Exception {
       
       HashMap<Long,Student> students = new HashMap<Long,Student>(); // словарь студентов
       Student s1 = new Student(1,"Сергей", "Иванов", 21 );
       Student s2 = new Student(2,"Андрей", "Сидоров", 22);
       Student s3 = new Student(3,"Иван", "Петров", 22);
       Student s4 = new Student(4,"Игорь", "Иванов", 23);
       Student s5 = new Student(5,"Даша", "Цветкова", 25);
       Student s6 = new Student(6,"Лена", "Незабудкина", 23);
       students.put((long) s1.getId(),s1);
       students.put((long) s2.getId(),s2);
       students.put((long) s3.getId(),s3);
       students.put((long) s4.getId(),s4);
       students.put((long) s5.getId(),s5);
       students.put((long) s6.getId(),s6);
       // Запуск программы
       iGetModel model = new HashModel("StudentsBD",students);
       iGetView view = new View();
       Controller controller = new Controller(view, model);
       controller.run();
    }
}
