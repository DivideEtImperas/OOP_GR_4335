package DependencyInversionPrinciple;

public class Car {
  private iEngine engine;

  public Car(iEngine engine) {
    this.engine = engine;
  }
  public void Start(String start){
    engine.doStart(start);
  }

  
}
