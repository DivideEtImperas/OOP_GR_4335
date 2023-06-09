package StudentDomen;

import java.util.Iterator;
import java.util.List;



public class StudentsTeam implements Iterable<StudentGroup>{
  /**
   * 
   */
  List<StudentGroup>team;
  private int teamNumber;
 /**
  * Кт-ор класса StudentsTeam
  * @param team поток
  * @param teamNumber номер потока
  */
  public StudentsTeam(List<StudentGroup> team, int teamNumber) {
    this.team = team;
    this.teamNumber = teamNumber;
  }
  /**
   * @return поток
   */
  public List<StudentGroup> getTeam() {
    return team;
  }
  /**
   * @param team инициализатор потока
   */
  public void setTeam(List<StudentGroup> team) {
    this.team = team;
  }
  /**
   * @return номера потока
   */
  public int getTeamNumber() {
    return teamNumber;
  }
  /**
   * @param teamNumber инициализатор номера потока
   */
  public void setTeamNumber(int teamNumber) {
    this.teamNumber = teamNumber;
  }
 // переопределение метода базового класса
  @Override
  public String toString() {
    return "StudentsTeam [team=" + team + ", streamNumber=" + teamNumber + "]";
  }

  @Override
  public Iterator<StudentGroup> iterator() {
    return new Iterator<StudentGroup>() {
      private int counter;
      
      @Override
      public boolean hasNext(){
        return counter<team.size();
      }

      @Override
      public StudentGroup next(){
        if(!hasNext())
        {
          return null;
        }
        return team.get(counter++);
      }

    };
  }

  }

 


