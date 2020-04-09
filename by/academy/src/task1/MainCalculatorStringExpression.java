package task1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class MainCalculatorStringExpression {
    public static void main(String[] args) {
        CalculatorStringExpression calc=new CalculatorStringExpression();
        calc.getStringResult("2-3^2");
//        Pattern pattern = compile("[()]");
//        String[] str1 = pattern.split("");
//        for (String s:str1) {
//            System.out.print(s+"; ");
//        }
//        System.out.println();
//        if (str1[0].length()==0)
//        System.out.println(str1[0].length());



//        String s="2(2+2-2)*3/4";
//        Pattern pattern = Pattern.compile("\\D");
//        String[] str1 = pattern.split(s);
//        Matcher matcher=pattern.matcher(s);
//        String [] str2=new String[str1.length];
//        Double[] number = new Double[str1.length];
//        int numberIndex = 0;
//        double sum=0;
//        for (int i=0;i<s.length();i++){
//            if (matcher.find()) System.out.println(i);
//            number[numberIndex] = Double.parseDouble(str2[i]);
//            sum += number[numberIndex];
//            numberIndex++;
 //       }
    }
}
