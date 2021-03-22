package homework2;

public class CalculationProgram {
    /*
    Create a simple program, that creates two integers
    and print the result of calculation of their
    addition, substruction, multiplication and division.
     */
    public static void main(String[] args) {
        int randomFirstInt = (int) Math.round(Math.random() * 100);
        int randomSecondInt = (int) Math.round(Math.random() * 100);

        int addition = randomFirstInt + randomSecondInt;
        int substruction = randomFirstInt - randomSecondInt;
        int multiplication = randomFirstInt * randomSecondInt;
        double division = (randomSecondInt != 0) ? (randomFirstInt * 1.0 / randomSecondInt) : 0;

        System.out.println("Addition result: " + randomFirstInt + " + " + randomSecondInt + " = " + addition);
        System.out.println("Substruction result: " + randomFirstInt + " - " + randomSecondInt + " = "  + substruction);
        System.out.println("Multiplication result: " + randomFirstInt + " * " + randomSecondInt + " = " + multiplication);
        System.out.println("Division result: " + randomFirstInt + " / " + randomSecondInt + " = " + division);
    }
}
