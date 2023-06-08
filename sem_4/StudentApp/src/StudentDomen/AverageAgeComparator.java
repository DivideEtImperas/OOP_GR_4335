package StudentDomen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Controllers.iPersonController;

// Обобщенность
public class AverageAgeComparator<T extends Person> {
   
    public int averageAge(List<Person> persons){
      int sum = 0;
      for (int i = 0; i < persons.size(); i++) {
        sum = sum + ((Person) persons).getAge();
      }
      sum = sum/persons.size();
      return sum;
    }



    
  }
  
  

 
  

 

