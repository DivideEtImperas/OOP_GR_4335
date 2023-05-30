package Products;
 // Класс Bottle наследник класса Product
public class Bottle extends Product {
  private int volume;

  /**
   * Create a product
   * @param productId    
   * @param productName  
   * @param productCategory 
   * @param price
   * @throws Exception  
   */
  
   public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception {
      super(productId, productName, productCategory, price);
      this.volume = volume;
   }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  @Override
  public String toString(){
    return "Product{" + 
    "name='" + super.getProductName() + '\'' + 
    "category='" + super.getProductCategory() + '\'' +
    ", cost=" + super.getPrice() +
    ", volume=" + volume +
    '}';
  }
  
}
