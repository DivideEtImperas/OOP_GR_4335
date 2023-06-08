package Controllers;

import java.util.ArrayList;
import java.util.List;

import Services.TeacherService;
import StudentDomen.AverageAgeComparator;
import StudentDomen.Teacher;

public class TeacherController implements iPersonController<Teacher> {
  private final TeacherService dataService = new TeacherService();

  @Override
  public void create(String firstName, String secomdName, int age) {
    dataService.create(firstName, secomdName, age);
  }

  static public <T extends Teacher> void paySalary(T person){
    System.out.println(person.getFirstName() + " выплачена зарплата 10000р.");
  }
  // static public <T extends Teacher> int averageAge(T[]person){
  //   int sum = 0;
  //   for (int i = 0; i < T.size(); i++) {
  //     sum = sum + person.getAge();  
  //   }
  //   sum = sum/person.getAge();
  //   return sum;
  // }
}
