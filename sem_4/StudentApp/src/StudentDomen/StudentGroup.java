package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
 
  List<Student> group;
  private int idGroup;
 /**
  * Кт-ор класса StudentGroup
  * @param group групп
  * @param idGroup уник. номер группы
  */
  public StudentGroup(List<Student> group, int idGroup) {
      this.group = group;
      this.idGroup = idGroup;
  }

  /**
 * @return группу
 */
public List<Student> getGroup() {
      return group;
  }
 
  /**
 * @param group инициализатор группы
 */
public void setGroup(List<Student> group) {
      this.group = group;
  }

  /**
 * @return уник. номер группы
 */
public int getIdGroup() {
      return idGroup;
  }

  /**
 * @param idGroup инициализатор уник. номера группы
 */
public void setIdGroup(int idGroup) {
      this.idGroup = idGroup;
  }

  @Override
  public String toString() {
      return "StudentGroup{" +
              "group=" + group +
              ", idGroup=" + idGroup +
              '}';
  }
// переопределение метода базового класса
  @Override
  public Iterator<Student> iterator() {

    return new Iterator<Student>()
    {
        private int counter;
   
        @Override
        public boolean hasNext() {
            return counter<group.size();
        }
    
        @Override
        public Student next() {
            if(!hasNext())
            {
                return null;
            }
            return group.get(counter++);
        }
    };
    // return new SGIterator(group);
  }



}