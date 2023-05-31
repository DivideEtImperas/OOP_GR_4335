package Classes;


public class OrdinaryClient extends Actor {

  public OrdinaryClient(String name) {
    super(name);
  }

  @Override
  public String getName() {
      return super.name;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
   return super.isMakeOrder;
  }

  public void setTakeOrder(boolean makeOrder) {
    super.isMakeOrder = makeOrder;
  }

  public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  public void setMakeDiscount(boolean makeDiscount) {
    super.isMakeDiscount = makeDiscount;
   
  }
 
  public void setTakeDiscount(boolean takeDiscount) {
    super.isTakeDiscount = takeDiscount;
  }
  
  public boolean isMakeDiscount() {
    return super.isMakeDiscount;
  }
  
  public boolean isTakeDiscount() {
   return super.isTakeDiscount;
  }
  public boolean isReturnOrder() {
    return super.isReturnOrder;
  }

  public Actor getActor() {
    return this;
  }
 
}
