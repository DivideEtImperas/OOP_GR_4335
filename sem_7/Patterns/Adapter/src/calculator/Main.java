public class Main {
    public static void main(String[] args) throws Exception {
        iCalculable calculator = new Calculator(0);
        // System.out.println(calculator);
        ViewCalculator view = new ViewCalculator(calculator);
        System.out.println(view);
        view.run();

        iComplexity complex = new Complex(0, 0);
        
        
        
        
    }
}
