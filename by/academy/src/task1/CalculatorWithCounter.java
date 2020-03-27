package task1;

import static task1.Constans.*;

public class CalculatorWithCounter implements ICalculator {
    private static int countOperationWithOperator = 0;
    private static int countOperationWithMath = 0;

    private ICalculator calculatorOperator = new CalculatorWithOperator();
    private ICalculator calculatorMath = new CalculatorWithMath();
    private int calculator;

    public int getCountOperation() {
        if (calculator == CAlCUlATORWITHOPERATOR) return countOperationWithOperator;
        return countOperationWithMath;
    }

    public CalculatorWithCounter(int calculator) {
        if (calculator == CAlCUlATORWITHOPERATOR || calculator == CAlCUlATORWITHMATH)
            this.calculator = calculator;
        else System.out.println("ты ввел не верные данные, мой юный друг!");
    }


    @Override
    public double getDivision(double dividend, double diviver) {
           //if (calculator!=CAlCUlATORWITHOPERATOR&&calculator!=CAlCUlATORWITHMATH)
        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getDivision(dividend, diviver);
        } else countOperationWithMath++;
        return calculatorMath.getDivision(dividend, diviver);
    }

    @Override
    public double getMultiplication(double firstNumber, double secondNumber) {
        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getMultiplication(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getMultiplication(firstNumber, secondNumber);
    }

    @Override
    public double getSubtraction(double firstNumber, double secondNumber) {

        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getSubtraction(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getSubtraction(firstNumber, secondNumber);
    }

    @Override
    public double getAddition(double firstNumber, double secondNumber) {

        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getAddition(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getAddition(firstNumber, secondNumber);
    }

    @Override
    public double getDegreeOf(double number, double power) {

        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getDegreeOf(number, power);
        } else countOperationWithMath++;
        return calculatorMath.getDegreeOf(number, power);
    }

    @Override
    public double getAbsOfNumber(double number) {

        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getAbsOfNumber(number);
        } else countOperationWithMath++;
        return calculatorMath.getAbsOfNumber(number);
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {

        if (calculator == CAlCUlATORWITHOPERATOR) {
            countOperationWithOperator++;
            return calculatorOperator.getSqrtOfNumber(number, power);
        } else countOperationWithMath++;
        return calculatorMath.getSqrtOfNumber(number, power);
    }
}
