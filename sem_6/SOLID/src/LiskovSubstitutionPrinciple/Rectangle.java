package LiskovSubstitutionPrinciple;

public class Rectangle extends Area {
  
  public Rectangle(int width, int height) {
    super(width, height);
  }
  @Override
  public int getHeight() {
    return super.getHeight();
  }
  @Override
  public int getWidth() {
    return super.getWidth();
  }
}
