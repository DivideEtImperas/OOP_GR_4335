package Model;

public class Student extends Person implements Comparable<Student> {
  /**
   * 
   */
  protected int id;
 /**
  * К-ор класса Student
  * @param firstName Имя
  * @param secondName Фамилия
  * @param age Возраст
  * @param id Уник. номер
  */
  public Student( int id, String firstName, String secondName, int age) {
    super(firstName, secondName, age);
    this.id = id;
  }

  /**
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id присваевает уник. номер
   */
  public void setId(int id) {
    this.id = id;
  }
//  переопределение метода базового класса
  @Override
  public String toString() {
    return "Student [firstName=" + super.firstName + ", secondName=" + super.getSecondName() + ", age=" + super.getAge() + "]";
  }

  @Override
  public int compareTo(Student o) {
    System.out.println(super.getFirstName() + " - " + o.getFirstName());
    if (this.getAge() == o.getAge()) {
      if (this.getId() == o.getId()) {
        return 0;
      }
      if (this.getId() < o.getId()) {
        return -1;
      }
      return 1;
    }
    if (this.getAge() < o.getAge()) {
      return -1;
    }
    return 1;
  }

}
