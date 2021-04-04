package homework6.tests;

public class AdvancedCalculator extends BaseCalculator {

    public double power(double a, double extent) {
        setLastResult(Math.pow(a, extent));
        return getLastResult();
    }

    public double sqrt(double a) {
        setLastResult(Math.sqrt(a));
        return getLastResult();
    }
}
