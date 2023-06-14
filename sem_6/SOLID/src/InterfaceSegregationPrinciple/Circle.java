package InterfaceSegregationPrinciple;

public class Circle implements iShapeCircle {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }
  @Override
  public double area() {
    return 2 * 3.14 * radius;
}
  
}
