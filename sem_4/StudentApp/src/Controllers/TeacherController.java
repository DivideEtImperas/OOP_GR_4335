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
 
}
