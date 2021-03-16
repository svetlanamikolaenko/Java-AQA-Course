package homework2;

public class CalculationProgram {
    public static void main(String[] args) {
        int randomFirstInt = (int) Math.round(Math.random() * 100);
        int randomSecondInt = (int) Math.round(Math.random() * 100);

        int addition = randomFirstInt + randomSecondInt;
        int substruction = randomFirstInt - randomSecondInt;
        int multiplication = randomFirstInt * randomSecondInt;
        double division = (randomSecondInt != 0) ? (randomFirstInt * 1.00 / randomSecondInt) : 0;

        System.out.println("randomFirstInt: " + randomFirstInt);
        System.out.println("randomSecondInt: " + randomSecondInt);
        System.out.println("Addition result: " + addition);
        System.out.println("Substruction result: " + substruction);
        System.out.println("Multiplication result: " + multiplication);
        System.out.println("Division result: " + division);
    }
}
