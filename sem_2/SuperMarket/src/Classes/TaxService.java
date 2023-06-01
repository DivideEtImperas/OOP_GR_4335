package Classes;

import Interfaces.iActorBehaviour;

public class TaxService implements iActorBehaviour {

  private String name;
  private boolean isTakeOrder;
  private boolean isMakeOrder;
  private boolean isMakeDiscount;
  private boolean isTakeDiscount;
  private boolean isReturnOrder;

  /**
   * Конструктор класса TaxService
   * 
   * @param name           имя
   * @param isTakeOrder    получить заказ
   * @param isMakeOrder    сделать заказ
   * @param isMakeDiscount скидка
   * @param isTakeDiscount получить скидку
   * @param isReturnOrder  вернуть заказ
   */

  public TaxService(String name, boolean isTakeOrder, boolean isMakeOrder, boolean isMakeDiscount,
      boolean isTakeDiscount, boolean isReturnOrder) {
    this.name = name;
    this.isTakeOrder = isTakeOrder;
    this.isMakeOrder = isMakeOrder;
    this.isMakeDiscount = isMakeDiscount;
    this.isTakeDiscount = isTakeDiscount;
    this.isReturnOrder = isReturnOrder;
  }

  // Присвоение имени
  public TaxService() {
    this.name = "Tax audit";
  }

  /**
   * @return name
   */
  // получение имени
  public String getName() {
    return name;
  }

  // сделать заказ
  @Override
  public boolean isMakeOrder() {
    return isMakeOrder;
  }

  // получить заказ
  @Override
  public boolean isTakeOrder() {
    return isTakeOrder;
  }

  // инициализация выполнения заказа
  @Override
  public void setMakeOrder(boolean makeOrder) {
    isMakeOrder = makeOrder;
  }

  // инициализация получения заказа
  @Override
  public void setTakeOrder(boolean pickUpOrder) {
    isTakeOrder = pickUpOrder;
  }

  // сделать скидку
  @Override
  public boolean isMakeDiscount() {
    return isMakeDiscount;
  }

  // получить скидку
  @Override
  public boolean isTakeDiscount() {
    return isTakeDiscount;
  }

  // инициализация скидки
  @Override
  public void setMakeDiscount(boolean makeDiscount) {
    isMakeDiscount = makeDiscount;
  }

  // инициализация получения скидки
  @Override
  public void setTakeDiscount(boolean takeDiscount) {
    isTakeDiscount = takeDiscount;
  }

  // возврат заказа
  @Override
  public boolean isReturnOrder() {
    return isReturnOrder;
  }

  @Override
  public Actor getActor() {
    return new OrdinaryClient(name);
  }
}
