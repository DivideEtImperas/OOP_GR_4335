public class CalcDecorator implements iCalculable {
    private iCalculable oldCalc;
    private Logger logger;

    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

     @Override
    public iCalculable add(int arg) {
        int firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода add с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.add(arg);
        logger.log(String.format("Вызова метода add произошел"));
        return result;
    }
    @Override
    public iCalculable sub(int arg) {
        int firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sub с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.sub(arg);
        logger.log(String.format("Вызова метода sub произошел"));
        return result;
    }

    @Override
    public iCalculable multi(int arg) {
        int firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }
    @Override
    public iCalculable div(int arg) {
        int firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода div с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
    
}
