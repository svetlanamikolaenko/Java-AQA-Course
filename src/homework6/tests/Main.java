package homework6.tests;

public class Main {

    public static void main(String[] args) {
        BaseCalculator baseCalculator = new BaseCalculator();
        System.out.println(baseCalculator.add(5, 10));
        System.out.println(baseCalculator.multiply(5, 10));
        System.out.println(baseCalculator.divide(5, 10));
        System.out.println(baseCalculator.subtract(5, 10));
        System.out.println(baseCalculator.getLastResult());

        System.out.println();
        AdvancedCalculator calculator = new AdvancedCalculator();
        System.out.println(calculator.power(10, 2));
        System.out.println(calculator.sqrt(100));
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.divide(5, 5));
        System.out.println(calculator.multiply(5, 5));
        System.out.println(calculator.subtract(5, 5));
        System.out.println(calculator.getLastResult());

        BaseCalculator baseCalculator2 = new AdvancedCalculator();
    }
}
