

public class Person<T,V> {
 
  protected T firstName;
  protected T secondName;
  protected V age;

  /**
   * Конструктор класса Person
   * 
   * @param firstName  Имя
   * @param secondName Фамилия
   * @param age        Возраст
   */

  // Конструктор
  public Person(T firstName, T secondName, V age) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }
  // получить имя
  public T getFirstName() {
    return firstName;
  }
  // инициализатор имени
  public void setFirstName(T firstName) {
    this.firstName = firstName;
  }
  // получить фамилию
  public T getSecondName() {
    return secondName;
  }
  // инициализатор фамилии
  public void setSecondName(T secondName) {
    this.secondName = secondName;
  }

  // получить возраст
  public V getAge() {
    return age;
  }
  // инициализатор возраста
  public void setAge(V age) {
    this.age = age;
  }

  // Метод переопределяет класс
  @Override
  public String toString() {
    return "Person [firstName=" + firstName + ", secondName=" + secondName + ", age=" + age + "]";
  }

}
