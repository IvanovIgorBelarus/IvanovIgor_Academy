package task1;

public class main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        float result = (float) calc.getAddition(calc.getAddition(4.1, calc.getMultiplication(15, 7)), calc.getDegreeOf(calc.getDivision(28, 5), 2));
        System.out.println("result= " + result);
    }

}
