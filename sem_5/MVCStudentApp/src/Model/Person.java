package Model;

public class Person {
 
  protected String firstName;
  protected String secondName;
  protected int age;

  /**
   * Конструктор класса Person
   * 
   * @param firstName  Имя
   * @param secondName Фамилия
   * @param age        Возраст
   */

  // Конструктор
  public Person(String firstName, String secondName, int age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }
  // получить имя
  public String getFirstName() {
    return firstName;
  }
  // инициализатор имени
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  // получить фамилию
  public String getSecondName() {
    return secondName;
  }
  // инициализатор фамилии
  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  // получить возраст
  public Integer getAge() {
    return age;
  }
  // инициализатор возраста
  public void setAge(int age) {
    this.age = age;
  }

  // Метод переопределяет класс
  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + "]";
  }

}
