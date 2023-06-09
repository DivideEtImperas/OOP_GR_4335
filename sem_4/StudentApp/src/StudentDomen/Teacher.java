package StudentDomen;

  public class Teacher extends Person{
    
    private String acadDegree;
    /**
     * Кт-ор класса Teacher
     * @param firstName имя
     * @param secondName фамилия
     * @param age возраст
     * @param acadDegree ученая степень
     */

    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }
    // получение 
    /**
     * @return ученую степень
     */
    public String getAcadDegree() {
      return acadDegree;
    }
    /**
     * @param acadDegree инициализатор степени учености
     */
    public void setAcadDegree(String acadDegree) {
      this.acadDegree = acadDegree;
    }

    // переопределение метода базового класса
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
    


