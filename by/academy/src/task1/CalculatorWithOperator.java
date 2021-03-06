package task1;

public class CalculatorWithOperator implements ICalculator {
    public CalculatorWithOperator() {
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
        double result = 1;
        if (power > 0)
            for (int i = 0; i < power; i++) result = result * number;
        else if (power < 0)
            for (int i = 0; i < getAbsOfNumber(power); i++) result = 1 / result * number;
        return result;
    }

    @Override
    public double getAbsOfNumber(double number) {
        double result = number;
        if (number < 0) result = number * (-1);
        return result;
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {
        return Math.pow(number, 1 / power);
    }
}


