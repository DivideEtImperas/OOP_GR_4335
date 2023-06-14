package InterfaceSegregationPrinciple;

public class Cube implements iShapeCube {

  private int edge;

  public Cube(int edge) {
    this.edge = edge;
  }

  @Override
  public double volume() {
    return edge * edge * edge;
  }
}
