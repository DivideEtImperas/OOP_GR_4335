package View;

import java.util.HashMap;
import java.util.Scanner;
import Model.Student;

public class ViewEng extends View  {
  // печать списка команд
  public void printCommands(){
    System.out.println("==========================Sudents=========================");
    System.out.println("Commands: {NONE-READ-WRITE-CREATE-UPDATE-LIST-DELETE-EXIT}");
 }
  // вывод словаря студентов
  public void printAllStudents(HashMap<Long,Student> students)
  {
      System.out.println("-----Output of the list of students-----");
      for (int i = 0; i < students.size(); i++) 
      {
          System.out.print(students);
      }
      System.out.println("-----End of the list-----");
  }
  // чтение данных с консоли
  @Override
  public String promptEng(String message) {
      Scanner in = new Scanner(System.in);
      System.out.print(message);
      return in.nextLine();
      
  } 
  }
  

