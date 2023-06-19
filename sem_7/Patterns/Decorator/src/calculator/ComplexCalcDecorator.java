public class ComplexCalcDecorator implements iComplexCalculable {
  private iComplexCalculable newCalc;
  private Logger logger;
  
  public ComplexCalcDecorator(iComplexCalculable newCalc, Logger log) {
    this.newCalc = newCalc;
    this.logger = log;
  }

  public ComplexCalcDecorator() {
  }

  @Override
  public iComplexCalculable add(Complex arg) {
    Complex firstArg = newCalc.getResult();
        
    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода add с параметром %d", firstArg, arg));
    iComplexCalculable result = newCalc.add(arg);
    logger.log(String.format("Вызова метода add произошел"));
    return result;
  }

  @Override
  public iComplexCalculable sub(Complex arg) {
    Complex firstArg = newCalc.getResult();
        
    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sub с параметром %d", firstArg, arg));
    iComplexCalculable result = newCalc.sub(arg);
    logger.log(String.format("Вызова метода sub произошел"));
    return result;
  }

  @Override
  public iComplexCalculable mult(Complex arg) {
    Complex firstArg = newCalc.getResult();
        
    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода mult с параметром %d", firstArg, arg));
    iComplexCalculable result = newCalc.mult(arg);
    logger.log(String.format("Вызова метода mult произошел"));
    return result;
  }

  
  @Override
  public iComplexCalculable div(Complex arg) {
    Complex firstArg = newCalc.getResult();
    logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода div с параметром %d", firstArg, arg));
    iComplexCalculable result = newCalc.div(arg);
    logger.log(String.format("Вызова метода div произошел"));
    return result;
  }

   @Override
    public Complex getResult() {
        Complex result = newCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

  @Override
  public void print() {
    newCalc.print();
  }

  
}
