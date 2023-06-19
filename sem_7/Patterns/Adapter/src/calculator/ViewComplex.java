import java.util.Scanner;

public class ViewComplex {
  private iComplexity calc;

  public ViewComplex(iComplexity calc) {
    this.calc = calc;
  }
  public void run() {
    while (true) {
      System.out.println("Введите действительные и мнимые части первого комплексного числа:");
      Complex real = new Complex();
      while (true) {
        String cmd = prompt("Введите команду (+,-,*,/,=): ");
        if (cmd.equals("+")) {
          System.out.println("Введите действительные и мнимые части второго комплексного числа:");
          Complex imaginary = new Complex();
          calc = real.add(imaginary);
          continue;

        }
        if (cmd.equals("-")) {
          System.out.println("Введите действительные и мнимые части второго комплексного числа:");
          Complex imaginary = new Complex();
          calc = real.sub(imaginary);
          continue;

        }
        if (cmd.equals("*")) {
          System.out.println("Введите действительные и мнимые части второго комплексного числа:");
          Complex imaginary = new Complex();
          calc = real.sub(imaginary);
          continue;

        }
        if (cmd.equals("/")) {
          System.out.println("Введите действительные и мнимые части второго комплексного числа:");
          Complex imaginary = new Complex();
          calc = real.sub(imaginary);
          continue;

        }
        if (cmd.equals("=")) {
          calc.print();
          break;
        }
      }
      String cmd = prompt("Еще посчитать (Y/N)?");
      if (cmd.equals("Y".toLowerCase())) {
        continue;
      }
      if (cmd.equals("N".toLowerCase()))
        break;
      break;
    }

  }
// Сканер данных с консоли
  private String prompt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextLine();
  }
  
  
}
