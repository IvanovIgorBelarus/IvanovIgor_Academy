package task1;

public class CalculatorWithOperator {
    public CalculatorWithOperator() {
    }

    public double getDivision(double dividend, double diviver) {
        return dividend / diviver;
    }

    public double getMultiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double getSubtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double getAddition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double getDegreeOf(double number, double power) {
        double result=1;
        if (power>0)
        for (int i=0;i<power;i++) result=result*number;
        else if (power<0)
            for (int i=0;i<getAbsOfNumber(power);i++) result=1/result*number;
        return result;
    }

    public double getAbsOfNumber(double number) {
        double result=number;
        if (number<0) result=number*(-1);
        return result;
    }

    public double getSqrtOfNumber(double number, double power) {
        return getDegreeOf(number,1/power);
    }
}


