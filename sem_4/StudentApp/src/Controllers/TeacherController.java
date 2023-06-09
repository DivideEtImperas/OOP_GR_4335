package Controllers;

import Services.TeacherService;
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
