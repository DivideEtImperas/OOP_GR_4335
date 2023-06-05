package StudentDomen;

import java.util.Iterator;
import java.util.List;
// реализует интерфейс Iterable,Comparable
public class StudentGroup implements Iterable<Student>{
 /**
  * 
  */
  List<Student> group;
  private int idGroup;
  private int sizeGroup;
  /**
   * К-ор класса StudentGroup
   * @param group Список студентов
   * @param idGroup уник. номер группы
   * @param sizeGroup размер группы
   */

public StudentGroup(List<Student> group, int idGroup,int sizeGroup) {
      this.group = group;
      this.idGroup = idGroup;
      this.sizeGroup = sizeGroup;
  }
 
  /**
 * @return группу
 */
public List<Student> getGroup() {
      return group;
  }

  /**
 * @param group инициализация группы
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
     * @param idGroup инициализация уник. номера
     */
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }
    
    /**
     * @return размер группы
     */
    public int getSizeGroup() {
        return sizeGroup;
    }
    
    /**
     * @param sizeGroup инициализатор размера группы
     */
    public void setSizeGroup(int sizeGroup) {
        this.sizeGroup = sizeGroup;
    }
// переопределение метода базового класса
  @Override
  public String toString() {
      return "StudentGroup{" +
              "group=" + group +
              ", idGroup=" + idGroup + 
              ", sizeGroup=" + sizeGroup +
              '}';
  }
 
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




