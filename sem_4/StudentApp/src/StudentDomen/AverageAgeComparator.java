package StudentDomen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Обобщенность
public class AverageAgeComparator<T extends Person>  {
   
    public <T extends Person>averageAge(T[]persons){
      int sum = 0;
      for (int i = 0; i < T.size(); i++) {
        sum = sum + persons[i].getAge();
      }
      sum = sum/T.size();
    }
 
  }
  
  

 
  

 

