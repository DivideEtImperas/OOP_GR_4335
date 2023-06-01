package Classes;

public class PromotionalClient extends Actor {

  private static int numberClient;

  /**
   * К-тор класса PromotionalClient
   * 
   * @param name имя
   */
  public PromotionalClient(String name) {
    super(name);
    // this.id = id;
  }

  /**
   * @return номер клиента
   */
  public int getNumberClient() {
    return numberClient;
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
  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
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

  public Actor getActor() {
    return this;
  }

}
