package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class STIterator implements Iterator<StudentGroup> {
 
  private int counter; // счетчик
  private final List<StudentGroup> studentTeams;
/**
 * К-тор класса STIterator
 * @param studentTeams поток студентов
 */
  public STIterator(List<StudentGroup> studentTeams) {
    this.studentTeams = studentTeams;
  }
 // возвращает true пока в кол-ии остались элементы 
  @Override
  public boolean hasNext() {
    return counter < studentTeams.size();
  }
 // вызывает исключение если элементов в кол-ии больше нет 
  @Override
  public StudentGroup next() {
    if(!hasNext()){
    return null;
  }
  return studentTeams.get(counter++);
}
}
