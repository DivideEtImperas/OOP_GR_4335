import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentsTeam;

public class App {
    public static void main(String[] args) throws Exception {
        // Person man = new Person("Денис", "Криницын", 35);
        // System.out.println(man.toString());

        // Student pers1 = new Student("Денис", "Криницын", 35, 1);
        // System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        Student s7 = new Student("Артур", "Прохоров", 24, 225);
        Student s8 = new Student("Петр", "Иванов", 24, 215);
        Student s9 = new Student("Ева", "Смирнова", 24, 205);
        Student s10 = new Student("Андрей", "Кочетов", 25, 225);
        Student s11 = new Student("Семен", "Юдин", 24, 235);
        // Student s12 = new Student("Павел", "Коротков", 25, 229);
        

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        // listStud1.add(pers1);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        
        // Создаем группы
        StudentGroup group4335 = new StudentGroup(listStud1, 4335,6);
        // System.out.println(group4335.toString());
        StudentGroup group2535 = new StudentGroup(listStud2, 2535,5);
        // System.out.println(group2535.toString());
        
        // for(Student stud:group4335)
        // {
        //     System.out.println(stud.toString());
        //     // Collections.sort(group4335.getGroup());
        // }
        // System.out.println("===============================");
        // Collections.sort(group4335.getGroup());
        
        // Добавляем группы в поток 
        List<StudentGroup> teams = new ArrayList<StudentGroup>();
        teams.add(group2535);
        teams.add(group4335);
        StudentsTeam sTeam1 = new StudentsTeam(teams, 1);
        // System.out.println(sTeam1);

        for(StudentGroup team:sTeam1){
            System.out.println(team.toString());
        }
        // Collections.sort(sTeam1.);
    }
}
