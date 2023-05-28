package Products;

public class HotDrink extends Product {
  private double temperature;

  /**
   * Create a product
   * @param productId  
   * @param productName
   * @param productCategory
   * @param price
   * @throws Exception  
   */

   public HotDrink(int productId, String productName, String productCategory, double price, double temperature) throws Exception {
    super(productId, productName, productCategory, price);
    this.temperature = temperature;
  }

  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  @Override
  public String toString(){
    return "Product{" + 
    "name='" + super.getProductName() + '\'' + 
    "category='" + super.getProductCategory() + '\'' +
    ", cost=" + super.getPrice() +
    ", volume=" + temperature +
    '}';
  }

  



  
}
