package Products;

/**
 * Class Product
 */
public class Product {
    private int productId;
    private String productName;
    private String productCategory;
    private double price;
   
    /**
     * 
     * @param productId       id продукта
     * @param productName     название продукта
     * @param productCategory категория продукта
     * @param price           цена продукта
     */
    public Product(int productId,String productName,String productCategory, double price){
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        
        }
        // Метод получения Id
        public int getProductId() {
          return productId;
        }
        // Метод присвоения Id
        public void setProductId(int productId){
          this.productId = productId;
        }
        // Метод получения имени продукта
        public String getProductName(){
          return productName;
        }
        // Метод присвоения имени продукта
        public void setProductName(String productName) {
          this.productName = productName;
        }
        // Метод получения категории продукта
        public String getProductCategory() {
          return productCategory;
        }
        // Метод получения цены продукта
        public double getPrice() {
          return price;
        }
        
        // Метод присвоения цены продукта
        public void setPrice(double price) {
          if(price <= 0){
              throw new IllegalStateException(String.format("Цена указана некорректно!", price));
          }
          this.price = price;
        }
        // переопределение метода базового класса
        @Override
        public String toString(){
          return "Product{" + 
          "name='" + productName + '\'' + 
          "category='" + productCategory + '\'' +
          ", cost=" + price + 
          '}';
        }


      }

