package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

// Класс TeacherService с подключенным интерфейсом iPersonService
public class TeacherService implements iPersonService<Teacher>{
  // private int count;
  
  private List<Teacher> teachers;
 
  public TeacherService() {
    this.teachers = new ArrayList<Teacher>();
    
  }

  @Override
  public List<Teacher> getAll() {
    return teachers;
  }
  @Override
  public void create(String firstName, String secomdName, int age) {
    Teacher pers =  new Teacher(firstName,secomdName,age,"Computer Science Teacher");
    teachers.add(pers);
  }
  public List<Teacher> getSortedByFIOTeacherList(){
    List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
    newTeachList.sort(new PersonComparator<Teacher>());
    return newTeachList;
  
  }
  
}
