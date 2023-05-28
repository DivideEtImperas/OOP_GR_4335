import Products.Bottle;
import Products.HotDrink;
import Products.Product;
import VendingMachine.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        // Product product1 = new Product(1, "Lays", "Чипсы", 59.5);
        
        // Product product2 = new Bottle(2, "Cola", "Drinks", 70,500);
        
        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(new Product(1, "Lays", "Чипсы", 59.5));
        iMachine.addProduct(new Bottle(2, "Cola", "Drinks", 70,500));
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 25 ,1500));
        iMachine.addProduct(new HotDrink(5,"Coffee","Drinks",25,60));
        iMachine.addProduct(new HotDrink(6,"Tea","Drinks",15,60));
        for(Product prod:iMachine.getProducts()){
            System.out.println(prod.toString());
        }
    }
}
