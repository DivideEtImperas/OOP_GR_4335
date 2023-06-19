public class Complex implements iComplexity{

  double real;
  double imaginary;
  
  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  Complex add (Complex a){
    double real2 = a.getReal();
    double imaginary2 = a.getImaginary();
    double newReal = real + real2;
    double newImaginary = imaginary + imaginary2;
    Complex result = new Complex(newReal, newImaginary);
    return result;
  }

  Complex sub (Complex a){
    double real2 = a.getReal();
    double imaginary2 = a.getImaginary();
    double newReal = real - real2;
    double newImaginary = imaginary - imaginary2;
    Complex result = new Complex(newReal, newImaginary);
    return result;
  }

  Complex mult (Complex a){
    double real2 = a.getReal();
    double imaginary2 = a.getImaginary();
    double newReal = real * real2 - imaginary * imaginary2;
    double newImaginary = imaginary* real2 + real * imaginary2;
    Complex result = new Complex(newReal, newImaginary);
    return result;
  }

   Complex div (Complex a){
    double real2 = a.getReal();
    double imaginary2 = a.getImaginary();
    double newReal = (real * real2 + imaginary * imaginary2)/(real2*real2 + imaginary2 * imaginary2);
    double newImaginary = (imaginary* real2 - real * imaginary2)/(real2*real2 + imaginary2 * imaginary2);
    Complex result = new Complex(newReal, newImaginary);
    return result;
  }
   public void print () {// вывод
		if(imaginary > 0){
			System.out.println(real + " + " + imaginary + "i");
		}else if(imaginary < 0){
			System.out.println(real + "" + imaginary + "i");
		}else{
			System.out.println(real);
    }
   }

}
