package Controllers;

import StudentDomen.Person;

public interface iPersonController<T extends Person> {
  void create(String firstName, String secomdName, int age);
}
