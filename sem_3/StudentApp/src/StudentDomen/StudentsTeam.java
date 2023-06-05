package StudentDomen;

import java.util.Iterator;
import java.util.List;



public class StudentsTeam implements Iterable<StudentGroup>{
  private List<StudentGroup>team;
  private int teamNumber;

  public StudentsTeam(List<StudentGroup> team, int teamNumber) {
    this.team = team;
    this.teamNumber = teamNumber;
  }

  public List<StudentGroup> getTeam() {
    return team;
  }

  public void setTeam(List<StudentGroup> team) {
    this.team = team;
  }

  public int getTeamNumber() {
    return teamNumber;
  }

  public void setTeamNumber(int teamNumber) {
    this.teamNumber = teamNumber;
  }

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
//   @Override
// public int compareTo(StudentGroup o) {
    
//     if (this.getSizeGroup() == o.getSizeGroup()) 
//     {
//         return 0;
//     }
//     if (this.getSizeGroup() < o.getSizeGroup()) 
//     {
//         return -1;
//     }
//     else{
//         return 1;
//     }
//     }

}
