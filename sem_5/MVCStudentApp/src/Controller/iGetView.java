package Controller;

import java.util.HashMap;
import Model.Student;
// интерфейс для связи View с Controller
public interface iGetView  {
  void printCommands();
  void printAllStudents(HashMap<Long,Student>students);
  String prompt(String message); 
  String promptEng(String message);
  Long number(String message);
  }
  
  
 

