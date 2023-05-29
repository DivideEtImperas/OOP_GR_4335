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

        public int getProductId() {
          return productId;
        }

        public void setProductId(int productId){
          this.productId = productId;
        }

        public String getProductName(){
          return productName;
        }

        public void setProductName(String productName) {
          this.productName = productName;
        }

        public String getProductCategory() {
          return productCategory;
        }

        public double getPrice() {
          return price;
        }
        

        public void setPrice(double price) {
          if(price <= 0){
              throw new IllegalStateException(String.format("Цена указана некорректно!", price));
          }
          this.price = price;
        }

        @Override
        public String toString(){
          return "Product{" + 
          "name='" + productName + '\'' + 
          "category='" + productCategory + '\'' +
          ", cost=" + price + 
          '}';
        }


      }

