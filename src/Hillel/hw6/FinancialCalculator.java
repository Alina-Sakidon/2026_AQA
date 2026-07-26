package Hillel.hw6;

public class FinancialCalculator extends BasicCalculator {

    public double simpleInterest(double principal, double rate, int years) {
        return principal * rate * years / 100;
    }

    @Override
    public void printResult(double result) {
        System.out.println("Financial calculator result is: " + result);
    }
}
