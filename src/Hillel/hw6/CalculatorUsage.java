package Hillel.hw6;

public class CalculatorUsage {
    public static void main(String[] args) {

        double a = 10.1;
        double b = 12;
        BasicCalculator basicCalculator = new BasicCalculator();
        FinancialCalculator financialCalculator = new FinancialCalculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        basicCalculator.printResult(basicCalculator.add(a, b));
        financialCalculator.printResult(financialCalculator.simpleInterest(10, 2, 5));
        scientificCalculator.printResult(scientificCalculator.pow(4, 2));
    }
}
