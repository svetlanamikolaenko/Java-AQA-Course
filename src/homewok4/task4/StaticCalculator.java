package homewok4.task4;
/*
4. Create a class StaticCalculator. It should have three fields: double firstValue, double secondValue and String operation.
Create all required constructors to properly initialize your object.
Consider the case when user does not provide any parameters when creates a new object.
Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
Write the test class which contains the main method.
In this main method you should create your StaticCalculator object and do some calculation to test your code,
by calling your "calculate" method.
Print all results to the console.
 */

import javax.swing.*;

public class StaticCalculator {
    private double firstValue;
    private double secondValue;
    private String operation;

    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public StaticCalculator() {
    }

    public double calculate(){
        switch (operation){
            case "+":
                return  firstValue + secondValue;
            case "-":
                return   firstValue - secondValue;
            case "*":
                return firstValue * secondValue;
            case "/":
                if (firstValue != 0)
                    return Math.round((firstValue / secondValue)*100.00)/100.0;
            default:
        }
        return 0.0;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public String getOperation() {
        return operation;
    }
}
