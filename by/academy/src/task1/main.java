package task1;

import com.sun.source.tree.WhileLoopTree;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        float result = (float) calc.getAddition(calc.getAddition(4.1, calc.getMultiplication(15, 7)), calc.getDegreeOf(calc.getDivision(28, 5), 2));
        System.out.println("result= " + result);
//        float result21 = result / 0;
//        System.out.println(result21);   infinity
//        double result21 = result / 0.0d;
//        System.out.println(result21);   infinity



    }
}







