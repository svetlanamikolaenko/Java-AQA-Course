package homework6.tests;

public class BaseCalculator {

    private double lastResult;

    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            lastResult = 0;
        }
        else {
            lastResult = a / b;
        }
        return lastResult;
    }

    public double getLastResult() {
        return lastResult;
    }

    public void setLastResult(double lastResult) {
        this.lastResult = lastResult;
    }
}
