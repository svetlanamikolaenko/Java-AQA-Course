package homewok4.task4;

public class TestCalculations {
    public static void main(String[] args) {
        StaticCalculator staticCalculator = new StaticCalculator(10, 3, "+");
        //addition
        System.out.println(staticCalculator.calculate());//13.3
        //division
        staticCalculator.setOperation("/");
        System.out.println(staticCalculator.calculate());//3.33
        staticCalculator.setFirstValue(0);
        System.out.println(staticCalculator.calculate());//0.0
        staticCalculator.setFirstValue(34);
        staticCalculator.setSecondValue(2.0);
        System.out.println(staticCalculator.calculate());//17.0
        //multiplication
        staticCalculator.setOperation("*");//68.0
        System.out.println(staticCalculator.calculate());
        //substruction
        staticCalculator.setOperation("-");//32.0
        System.out.println(staticCalculator.calculate());

    }
}
