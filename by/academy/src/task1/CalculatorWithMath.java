package task1;

public class CalculatorWithMath implements ICalculator {
    public CalculatorWithMath() {
    }

    @Override
    public double getDivision(double dividend, double diviver) {
        return dividend / diviver;
    }

    @Override
    public double getMultiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double getSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double getAddition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double getDegreeOf(double number, double power) {
        return Math.pow(number, power);
    }

    @Override
    public double getAbsOfNumber(double number) {
        return Math.abs(number);
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {
        return Math.pow(number, 1 / power);
    }
}
