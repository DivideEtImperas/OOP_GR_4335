package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.PersonComparator;

public class EmployeeService implements iPersonService<Employee> {
  // private int count;
  private List<Employee> employees;

  public EmployeeService() {
    this.employees = new ArrayList<Employee>();
  }

  @Override
  public List<Employee> getAll() {
    return employees;
  }

  @Override
  public void create(String firstName, String secomdName, int age) {
    Employee pers = new Employee(firstName, secomdName, age, "basic");
    employees.add(pers);
    
  }
  public List<Employee> getSortedByFIOEmployeeList(){
    List<Employee> newEmployList = new ArrayList<Employee>(employees);
    newEmployList.sort(new PersonComparator<Employee>());
    return newEmployList;
  }
}
