package Hillel.hw6;

public class ScientificCalculator extends BasicCalculator {
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public void printResult(double result) {
        System.out.println("Scientific calculator result is: " + result);
    }
}
