public interface iComplexCalculable {
  // Интерфейс
  iComplexCalculable add(Complex arg);
  iComplexCalculable sub(Complex arg);
  iComplexCalculable mult(Complex arg);
  iComplexCalculable div(Complex arg);
  Complex getResult();
  void print();

}
