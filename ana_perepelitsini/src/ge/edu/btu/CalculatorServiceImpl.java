package ge.edu.btu;

public class CalculatorServiceImpl {
    CalculatorService calculatorService= new CalculatorService() {
        @Override
        public int sum(int a, int b) {
            return a+b;
        }

        @Override
        public int prod(int a, int b) {
            return a+b;
        }
    };

    public int sum(int a,int b){
        return a+b;
    }

    public int prod(int a,int b){
        return a*b;
    }

}