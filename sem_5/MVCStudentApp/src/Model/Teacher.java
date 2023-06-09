package Model;

  public class Teacher extends Person{
    private String acadDegree;

    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
    public String getAcadDegree() {
      return acadDegree;
    }
    
    public void setAcadDegree(String acadDegree) {
      this.acadDegree = acadDegree;
    }
    @Override
    public String toString() {
      return "Teacher{" +
      "firstName='" + super.firstName + '\'' +
      ", secondName='" + super.getSecondName() + '\'' +
      ", age=" + super.getAge() +
      ", acadDegree=" + acadDegree +
      '}';
    }
   
    }
    


