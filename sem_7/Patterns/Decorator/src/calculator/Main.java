
/**
 * @author Golyshev Eduard
 * @Date: 19.06.2023 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================_Calculator_===================");
        System.out.println("1 = Calculator, 2 = Calculator of complex numbers");
        // iCalculable calculator = new Calculator(0);
        iCalculable calculator = new CalcDecorator(new Calculator(0), new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        // view.run();
        
        iComplexCalculable complexCalc = new ComplexCalcDecorator();
        ViewComplexCalc viewComplexCalc = new ViewComplexCalc(complexCalc);
        // viewComplexCalc.run();

        Scanner iScanner = new Scanner(System.in);
        String key = iScanner.nextLine();

        switch (key) {
            case "1":
                view.run();
                break;
            case "2":
                viewComplexCalc.run();
                break;
            default:
                break;

        }

    }

}
