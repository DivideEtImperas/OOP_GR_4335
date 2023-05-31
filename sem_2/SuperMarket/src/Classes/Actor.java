package Classes;
import Interfaces.iActorBehaviour;
/**
 * Класс Actor - абстрактный класс который используется, как  
 * каркас для создания подобных обЪектов
 * @author Golyshev Eduard
 * @version 1.0
 */
 public abstract class Actor implements iActorBehaviour {
  /**
   * Инициализация полей
   */
  protected String name;
  protected boolean isTakeOrder;
  protected boolean isMakeOrder;
  protected boolean isMakeDiscount;
  protected boolean isTakeDiscount;
  protected boolean isReturnOrder;
  /**
   * инициализация поля
   * @param name для хранения имени
   */
public Actor(String name){
  this.name=name;
}
/**
 * @return Метод возвращает имя
 */
abstract public String getName();

}
