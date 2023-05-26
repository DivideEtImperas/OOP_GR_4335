import Products.Bottle;
import Products.Product;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Lays", "Чипсы", 59.5);
        product1.setPrice(98);
        Product product2 = new Bottle(2, "Cola", "Drinks", 70,500);
        
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(product1);
        iMachine.addProduct(product2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59.0));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 25.5 ,1500));

        for(Product prod:iMachine.getProducts()){
            System.out.println(prod.toString());
        }
    }
}
