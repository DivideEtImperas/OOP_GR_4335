package Classes;

public class SpecialClient extends Actor {

    private int idVIP;
    
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    public int getId() {
        return idVIP;
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
