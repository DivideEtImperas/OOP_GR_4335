package StudentDomen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Controllers.iPersonController;

// Обобщенность
public class AverageAgeComparator<T extends Person> {
   
    public int averageAge(List<T> persons){
      int sum = 0;
      for (int i = 0; i < persons.size(); i++) {
        sum += persons.get(i).getAge();
      }
      sum = sum/persons.size();
      return sum;
    }
    
    public void printAverageAge(List<T> persons,int sum){
      for (int i = 0; i < persons.size(); i++) {
        System.out.println(persons.get(i));
      }
      System.out.println("средний возраст = " + sum);
    }



    
  }
  
  

 
  

 

