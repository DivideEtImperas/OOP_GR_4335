package SingleResponsibilityPrinciple;

import java.sql.Date;

public class Employee {
 
  private String name;
  private Date dob;
 /**
  * К-ор класса Employee
  * @param name имя
  * @param dob дата рождения
  */
  public Employee(String name, Date dob) {
    this.name = name;
    this.dob = dob;
  }

  public String getEmpInfo() {
    return "name - " + name + " , dob - " + dob.toString();
  }

}
