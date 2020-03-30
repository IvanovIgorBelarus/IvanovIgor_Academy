package task1;

public class CalculatorWithCounterVersion2 implements ICalculator {
    private static int countOperationWithOperator = 0;
    private static int countOperationWithMath = 0;
    private ICalculator calculatorOperator;
    private ICalculator calculatorMath;

    public CalculatorWithCounterVersion2(CalculatorWithOperator calculatorOperator) {
        this.calculatorOperator = calculatorOperator;
    }

    public CalculatorWithCounterVersion2(CalculatorWithMath calculatorMath) {
        this.calculatorMath = calculatorMath;
    }

    public int getCountOperation() {
        if (calculatorOperator != null) return countOperationWithOperator;
        return countOperationWithMath;

    }

    @Override
    public double getDivision(double dividend, double diviver) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getDivision(dividend, diviver);
        } else countOperationWithMath++;
        return calculatorMath.getDivision(dividend, diviver);
    }

    @Override
    public double getMultiplication(double firstNumber, double secondNumber) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getMultiplication(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getMultiplication(firstNumber, secondNumber);
    }

    @Override
    public double getSubtraction(double firstNumber, double secondNumber) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getSubtraction(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getSubtraction(firstNumber, secondNumber);
    }

    @Override
    public double getAddition(double firstNumber, double secondNumber) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getAddition(firstNumber, secondNumber);
        } else countOperationWithMath++;
        return calculatorMath.getAddition(firstNumber, secondNumber);
    }

    @Override
    public double getDegreeOf(double number, double power) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getDegreeOf(number, power);
        } else countOperationWithMath++;
        return calculatorMath.getDegreeOf(number, power);
    }

    @Override
    public double getAbsOfNumber(double number) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getAbsOfNumber(number);
        } else countOperationWithMath++;
        return calculatorMath.getAbsOfNumber(number);
    }

    @Override
    public double getSqrtOfNumber(double number, double power) {
        if (calculatorOperator != null) {
            countOperationWithOperator++;
            return calculatorOperator.getSqrtOfNumber(number, power);
        } else countOperationWithMath++;
        return calculatorMath.getSqrtOfNumber(number, power);
    }
}
