package Classes;

public class SpecialClient extends Actor {

  private int idVIP;

  /**
   * Конструктор класса SpecialClient
   * 
   * @param name  имя
   * @param idVIP уник. номер
   */
  public SpecialClient(String name, int idVIP) {
    super(name);
    this.idVIP = idVIP;
  }

  // получить уник. номер
  public int getId() {
    return idVIP;
  }

  // получение имени
  @Override
  public String getName() {
    return super.name;
  }

  // сделать заказ
  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  // получить заказ
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

  // инициализация выполнения заказа
  public void setMakeDiscount(boolean makeDiscount) {
    super.isMakeDiscount = makeDiscount;

  }

  // инициализация получения заказа
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
