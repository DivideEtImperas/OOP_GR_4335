package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class SGIterator implements Iterator<Student> {

 private int counter; // счетчик
 private final List<Student> students;
/**
 * К-тор класса SGIterator
 * @param students список студентов
 */

public SGIterator(List<Student> students) {
  this.students = students;
}
// Метод возвращает true пока в кол-ии остались элементы 
  @Override
  public boolean hasNext() {
    return counter < students.size();
  }
 // вызывает исключение если элементов в кол-ии больше нет 
  @Override
  public Student next() {
    if(!hasNext()){
      return null;
    }
    return students.get(counter++);
  }
  
}
