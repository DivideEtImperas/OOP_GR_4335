package StudentDomen;
/**
 * Класс Employee наследник класса Person
 */
public class Employee extends Person {
 
  private String special;
 /**
  * Конструктор класса Employee
  * @param special специальность
  */
  public Employee(String firstName, String secondName, int age, String special) {
  super(firstName, secondName, age);
  this.special = special;
  }

  // получает специальность
  public String getSpecial() {
    return special;
  }
  // инициализатор специальности
  public void setSpecial(String special) {
    this.special = special;
  }
 // переопределение метода базового класса
  @Override
  public String toString() {
    return "Employee[" +
    "firstName='" + super.firstName + '\'' +
    ", secondName='" + super.getSecondName() + '\'' +
    ", age=" + super.getAge() +
    ", special=" + special + "]";
  }

  
}
