package ge.edu.btu;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorService=new CalculatorServiceImpl();
        calculatorService.sum(20,4);
        calculatorService.prod(20,4);
    }
}
