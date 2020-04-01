package task1;

import static task1.Constans.*;

public class MainCalculatorWithCounter {
    public static void main(String[] args) {
/**
 * ver.1 - один конструктор реадизованный через константы;
 */
        System.out.println("ver.1:");
        CalculatorWithCounter calc = new CalculatorWithCounter(CAlCUlATORWITHOPERATOR);
        System.out.println("CalculatorWithOperator:");
        float result = (float) calc.getAddition(calc.getAddition(4.1, calc.getMultiplication(15, 7)), calc.getDegreeOf(calc.getDivision(28, 5), 2));
        System.out.println("result= " + result + "; countOperation= " + calc.getCountOperation());
        CalculatorWithCounter calc1 = new CalculatorWithCounter(CAlCUlATORWITHMATH);
        System.out.println("CalculatorWithMath:");
        float result1 = (float) calc1.getAddition(calc1.getAddition(4.1, calc1.getMultiplication(15, 7)), calc1.getDegreeOf(calc1.getDivision(28, 5), 2));
        System.out.println("result= " + result1 + "; countOperation= " + calc1.getCountOperation());

        System.out.println();

/**
 * ver.2 - два конструктора реадизованных через проверку существования объекта;
 */
        System.out.println("ver.2:");
        CalculatorWithCounterVersion2 calc2 = new CalculatorWithCounterVersion2(new CalculatorWithOperator());
        CalculatorWithCounterVersion2 calc3 = new CalculatorWithCounterVersion2(new CalculatorWithMath());

        System.out.println("CalculatorWithOperator:");
        float result2 = (float) calc2.getAddition(calc2.getAddition(4.1, calc2.getMultiplication(15, 7)), calc2.getDegreeOf(calc2.getDivision(28, 5), 2));
        System.out.println("result= " + result2 + "; countOperation= " + calc2.getCountOperation());

        System.out.println("CalculatorWithMath:");
        float result3 = (float) calc3.getAddition(calc3.getAddition(4.1, calc3.getMultiplication(15, 7)), calc3.getDegreeOf(calc3.getDivision(28, 5), 2));
        System.out.println("result= " + result3 + "; countOperation= " + calc3.getCountOperation());


    }
}
