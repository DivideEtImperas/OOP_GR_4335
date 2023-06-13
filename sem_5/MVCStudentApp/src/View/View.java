package View;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Controller.iGetView;
import Model.Student;

public class View implements iGetView {
 // печать списка команд
 public void printCommands(){
    System.out.println("==========================Sudents=========================");
    System.out.println("Commands: {NONE-READ-WRITE-CREATE-UPDATE-LIST-DELETE-EXIT}");
 }
  // вывод словаря студентов
  public void printAllStudents(HashMap<Long,Student> students)
  {
      System.out.println("-----Вывод списка студентов-----");
      for (Map.Entry<Long,Student> m: students.entrySet()) 
      {
          System.out.println(m.getKey() + " : " + m.getValue());
      }
      System.out.println("-----Конец списка-----");
  }
 // методы чтения данных с консоли
  @Override
  public String prompt(String message) {
      Scanner in = new Scanner(System.in);
      System.out.print(message);
      return in.nextLine();  
  }

  @Override
  public String promptEng(String message) {
      Scanner in = new Scanner(System.in);
      System.out.print(message);
      return in.nextLine();
  }

  @Override
  public Long number(String message){
    Scanner iScanner = new Scanner(System.in);
    System.out.print(message);
    return iScanner.nextLong();
  }
}
