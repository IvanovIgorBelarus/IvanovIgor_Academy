package task1;


public class mainCalculatorStringExpression {
    public static void main(String[] args) {
     CalculatorStringExpression calc = new CalculatorStringExpression("2*2+10-2/2");
       System.out.println(calc.getStringResult());
    }
}

