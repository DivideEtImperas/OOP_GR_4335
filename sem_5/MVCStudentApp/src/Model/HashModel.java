package Model;

import java.util.HashMap;

public class HashModel extends FileModel{

 private HashMap<Long,Student> students;
/**
 * К-ор класса HashModel
 * @param fileName Имя файла
 * @param students словарь студентов
 */
  
  public HashModel(String fileName, HashMap<Long, Student> students) {
  super(fileName);
  this.students = students;
}
  // получает студентов
  public HashMap<Long, Student> getAllStudents() {
    return students;
  }
  // удаляет студентов
  public void deleteStudent(HashMap<Long,Student> students, Long number){
     students.remove(number);
  }

}
