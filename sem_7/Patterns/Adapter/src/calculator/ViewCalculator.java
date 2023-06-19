import java.util.Scanner;

public class ViewCalculator {
  
  private iCalculable calculator;

  public ViewCalculator(iCalculable calculator) {
    this.calculator = calculator;
  }

  public void run() {
    while(true){
      int primaryArg = promptInt("Введите первый аргумент: ");
      calculator.add(primaryArg);

      while(true){
        String cmd = prompt("Введите команду (+, -, *, /, =) : ");
        if (cmd.equals("-4")) {
          int arg = promptInt("Введите второй аргумент: ");
          calculator.sub(arg);
          continue;
        }
        if (cmd.equals("*")) {
          int arg = promptInt("Введите второй аргумент: ");
          calculator.mult(arg);
          continue;
        }
        if (cmd.equals("/")) {
          int arg = promptInt("Введите второй аргумент: ");
          calculator.div(arg);
          continue;
        }
        if(cmd.equals("=")){
          int result = calculator.getResult();
          System.out.printf("Результат %d\n", result);
          break;
        }
        if(cmd.equals("Complex")){
          
        }
      }
      String cmd = prompt("Еще посчитать (Y/N)?");
      if(cmd.equals("Y".toLowerCase())){
        continue;
      }
      break;
    }
  }
private String prompt(String message){
  Scanner in = new Scanner(System.in);
  System.out.print(message);
  return in.nextLine();
}
private int promptInt(String message){
  Scanner in = new Scanner(System.in);
  System.out.print(message);
  return Integer.parseInt(in.nextLine());
}

}
