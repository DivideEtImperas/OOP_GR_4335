package Controller;

import java.util.HashMap;
import Model.Student;
// интерфейс для связи Model с Controller
public interface iGetModel {
  public HashMap<Long,Student>getAllStudents();
  void deleteStudent(HashMap<Long,Student> students,Long command);
  void saveAllStudentToFile(HashMap<Long,Student> students);
}
