package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
  
  void setMakeOrder(boolean makeOrder);
  void setTakeOrder(boolean pickUpOrder);
  boolean isMakeOrder();
  boolean isTakeOrder();
  void setMakeDiscount(boolean makeDiscount);
  void setTakeDiscount(boolean takeDiscount);
  boolean isMakeDiscount();
  boolean isTakeDiscount();
  Actor getActor();
  boolean isReturnOrder();
}
