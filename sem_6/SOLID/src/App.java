
import LiskovSubstitutionPrinciple.Square;
import LiskovSubstitutionPrinciple.Rectangle;
import OpenClosedPrinciple.Car;
import OpenClosedPrinciple.SpeedCalculation;



public class App {
    public static void main(String[] args) throws Exception {
        
        Car car = new Car(240, "Car");
        SpeedCalculation calculation = new SpeedCalculation();
        // calculation.calculateAllowedSpeed(new Car(200, "Mersedes"));
        // calculation.calculateAllowedSpeed(new Bus(160, "Volvo"));
        System.out.println(calculation.calculateAllowedSpeed(car));

        Square square = new Square(20, 20);
        Rectangle rectangle =  new Rectangle(20, 40);
        System.out.println("Площадь прямоугольника = " + rectangle.area());
        System.out.println("Площадь квадрата = " + square.area());
        
    }   
}
