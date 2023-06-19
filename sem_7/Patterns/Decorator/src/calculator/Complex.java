
/**
 * @author Golyshev Eduard
 * @Date: 19.06.2023
 */
import java.util.Scanner;

public final class Complex implements iComplexCalculable {

  private double real;
  private double imaginary;
  private Complex result;

  /**
   * К-ор класса Complex
   * 
   * @param real      реальная часть
   * @param imaginary мнимая часть
   * @param result    результат
   */
  Complex(double real, double imaginary, Complex result) {
    this.real = real;
    this.imaginary = imaginary;
    this.result = result;
  }

  /**
   * К-ор без параметров
   */
  Complex() {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("real: ");
    double real = iScanner.nextDouble();
    System.out.print("imaginary: ");
    double imaginary = iScanner.nextDouble();
    this.real = real;
    this.imaginary = imaginary;
  }

  /**
   * @return возвращает реальное число
   */
  public double getReal() {
    return real;
  }

  /**
   * @param real инициализация реального числа
   */
  public void setReal(double real) {
    this.real = real;
  }

  /**
   * @return возвращает мнимое число
   */
  public double getImaginary() {
    return imaginary;
  }

  /**
   * @param imaginary возвращает мнимое число
   */
  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  // Метод сложения
  @Override
  public iComplexCalculable add(Complex arg) {
    double real2 = arg.getReal();
    double imaginary2 = arg.getImaginary();
    double newReal = real + real2;
    double newImaginary = imaginary + imaginary2;
    result = new Complex(newReal, newImaginary, result);
    return result;
  }

  // Метод вычитания
  @Override
  public iComplexCalculable sub(Complex arg) {
    double real2 = arg.getReal();
    double imaginary2 = arg.getImaginary();
    double newReal = real - real2;
    double newImaginary = imaginary - imaginary2;
    result = new Complex(newReal, newImaginary, result);
    return result;
  }

  // Метод умножения
  @Override
  public iComplexCalculable mult(Complex arg) {
    double real2 = arg.getReal();
    double imaginary2 = arg.getImaginary();
    double newReal = real * real2 - imaginary * imaginary2;
    double newImaginary = real * real2 + imaginary * imaginary2;
    result = new Complex(newReal, newImaginary, result);
    return result;

  }

  // Метод деления
  @Override
  public iComplexCalculable div(Complex arg) {
    double real2 = arg.getReal();
    double imaginary2 = arg.getImaginary();
    double newReal = (real * real2 + imaginary * imaginary2) / (real2 * real2 + imaginary2 * imaginary2);
    double newImaginary = (imaginary * real2 - real * imaginary2) / (real2 * real2 + imaginary2 * imaginary2);
    result = new Complex(newReal, newImaginary, result);
    return result;
  }

  // Метод возвращает результат
  @Override
  public Complex getResult() {
    return result;
  }

  // Метод печати результата
  public void print() {
    if (imaginary > 0) {
      System.out.println("result = " + real + " + " + imaginary + "i");
    } else if (imaginary < 0) {
      System.out.println("result = " + real + "" + imaginary + "i");
    } else {
      System.out.println("result = " + real);
    }

  }

}
