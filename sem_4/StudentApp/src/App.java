import java.util.ArrayList;
import java.util.List;
import StudentDomen.AverageAgeComparator;
import StudentDomen.Employee;
import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
       

        Student s1 = new Student("Сергей", "Иванов", 23, 101);
        Student s2 = new Student("Андрей", "Сидоров", 23, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 22, 104);
        List<Person> listStud = new ArrayList<Person>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
       
        Employee e1 = new Employee("Иван", "Иванов", 40, "Plumber");
        Employee e2 = new Employee("Петр", "Петров", 36, "Supply manager");
        Employee e3 = new Employee("Семен", "Сидоров", 25, "Basic");
        List<Person> listEmpl = new ArrayList<Person>();
        listEmpl.add(e1);
        listEmpl.add(e2);
        listEmpl.add(e3);
    

        Teacher t1 = new Teacher("Елена", "Иванова", 42, "Computer Science Teacher");
        Teacher t2 = new Teacher("Андрей", "Петров", 37, "Data Science Teacher");
        Teacher t3 = new Teacher("Света", "Смирнова", 46, "Programming Teacher");
        List<Person> listTeach = new ArrayList<>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);
        System.out.println("=======================================");
        AverageAgeComparator<Person>techList = new AverageAgeComparator<Person>();
        techList.printAverageAge(listTeach, techList.averageAge(listTeach));
        System.out.println("=======================================");
        AverageAgeComparator<Person>studList = new AverageAgeComparator<Person>();
        studList.printAverageAge(listStud,studList.averageAge(listStud));
        System.out.println("=======================================");
        AverageAgeComparator<Person>emplList = new AverageAgeComparator<Person>();
        emplList.printAverageAge(listEmpl,emplList.averageAge(listEmpl));

    
        
    }
    }

