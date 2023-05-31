package Classes;


public class PromotionalClient extends Actor {
  
  private static int numberClient;
    
  /**
   * @param name
   */
  public PromotionalClient(String name) {
      super(name);
      // this.id = id;
  }

  /**
   * @return 
   */
  public int getNumberClient() {
      return numberClient;
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

  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
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
