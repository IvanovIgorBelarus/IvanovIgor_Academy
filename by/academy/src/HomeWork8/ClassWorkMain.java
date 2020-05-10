package HomeWork8;

import java.util.regex.Pattern;
/*
1. Чем отличается matches() и find().
 matches():
 @return  {@code true} if, and only if, this string matches the
 given regular expression
 find():
 @return  {@code true} if, and only if, a subsequence of the input
 sequence matches this matcher's pattern
 Т.е. matches() вернёт true, только когда ВСЯ строка соответствует шаблону,
 а find() ищет соответствие ПОДСТРОКИ в данной строке к заданному шаблону.



  */
public class ClassWorkMain {
    public static void main(String[] args) {
        String text = "Я люблю JAVA";
        System.out.println(text.matches("h?"));
        System.out.println(text.matches("h*"));
        System.out.println(text.matches("h+"));

        Pattern pattern1 = Pattern.compile("h?");
        Pattern pattern2 = Pattern.compile("h*");
        Pattern pattern3 = Pattern.compile("h+");

        System.out.println("_________");

        System.out.println(pattern1.matcher(text).find());
        System.out.println(pattern2.matcher(text).find());
        System.out.println(pattern3.matcher(text).find());
    }
}
