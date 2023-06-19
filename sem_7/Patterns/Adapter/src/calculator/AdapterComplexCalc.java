public class AdapterComplexCalc implements iCalculable {
  private iComplexity adaptee;

  public AdapterComplexCalc(iComplexity adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public iCalculable add(int arg) {
    return (iCalculable) adaptee.add();
  }

  @Override
  public iCalculable div(int arg) {
    return (iCalculable) adaptee.div();
  }


  @Override
  public iCalculable mult(int arg) {
    return (iCalculable) adaptee.mult();
  }

  @Override
  public iCalculable sub(int arg) {
    return (iCalculable) adaptee.div();
  }

 

  // @Override
  // public String toString() {
  //   return "Complex =" + adaptee.print();
  // }

  @Override
  public int getResult() {
    return adaptee.getResult();
   
  }

  
 
  
}
