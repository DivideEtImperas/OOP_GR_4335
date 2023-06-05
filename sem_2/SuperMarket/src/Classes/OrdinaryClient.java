package Classes;

public class OrdinaryClient extends Actor {

  /**
   * Конструктор класса OrdinaryClient
   * 
   * @param name имя
   */
  public OrdinaryClient(String name) {
    super(name);
  }

  // получить имя
  @Override
  public String getName() {
    return super.name;
  }

  // получить заказ
  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  // сделать заказ
  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  // инициализация получения заказа
  public void setTakeOrder(boolean makeOrder) {
    super.isMakeOrder = makeOrder;
  }

  // инициализация выполнения заказа
  public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  // инициализация скидки
  public void setMakeDiscount(boolean makeDiscount) {
    super.isMakeDiscount = makeDiscount;

  }

  // инициализация получения скидки
  public void setTakeDiscount(boolean takeDiscount) {
    super.isTakeDiscount = takeDiscount;
  }

  // сделать скидку
  public boolean isMakeDiscount() {
    return super.isMakeDiscount;
  }

  // получить скидку
  public boolean isTakeDiscount() {
    return super.isTakeDiscount;
  }

  // возврат заказа
  public boolean isReturnOrder() {
    return super.isReturnOrder;
  }
  // возвращает саммого себя
  public Actor getActor() {
    return this;
  }

}
