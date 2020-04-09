package task1;

import java.util.regex.Pattern;

/*
Вычисление выражения происходит с помощью постепенной обработки частей выражения. Каждый метод обрабатывает отдельный
кусочек строки (тот, который он знает как обработать) и передает остаток строки дальше, следующему методу В свою очередь
последний вызванный метод возвращает необработанный кусок строки первому методу. Таким образом обработка строки происходит
до тех пор, пока есть что обрабатывать. Используется следующий алгоритм приоритетов операторов:
"+" -> "-" -> "*" -> "/".
P.s. Не решенные проблемы CalculatorStringExpression
1. Не верно обрабатывает строки со скобками;
2. Не знает действие операторов "^" и "||";
3. Не знает константы "PI" и "Е";
4. Не контролирует допустие символы (числа, операторы, скобки, константы);
 */
public class CalculatorStringExpression {
    public void getStringResult(String string) {
        System.out.println(getPlusResult(string));
    }

    private double getPlusResult(String s) {
        double sum = 0;
        if (s.length() == 0) {
            return sum;
        }
        Pattern pattern = Pattern.compile("\\+");
        String[] str1 = pattern.split(s);
        Double[] number = new Double[str1.length];
        int numberIndex = 0;
        for (int i = 0; i < str1.length; i++)
            try {
                number[numberIndex] = Double.parseDouble(str1[i]);
                sum += number[numberIndex];
                numberIndex++;
            } catch (NumberFormatException e) {
                sum += getMinusResult(str1[i]);
            }
        return sum;
    }

    private double getMinusResult(String s) {
        Pattern pattern = Pattern.compile("\\-");
        String[] str1 = pattern.split(s);
        Double[] number = new Double[str1.length];
        double sum;
        int numberIndex = 0;
        try {
            number[numberIndex] = Double.parseDouble(str1[0]);
            sum = number[numberIndex];
            numberIndex++;
        } catch (NumberFormatException e) {
            sum = getMultiResult(str1[0]);
        }
        for (int i = 1; i < str1.length; i++)
            try {
                number[numberIndex] = Double.parseDouble(str1[i]);
                sum -= number[numberIndex];
                numberIndex++;
            } catch (NumberFormatException e) {
                sum -= getMultiResult(str1[i]);
            }
        return sum;
    }

    private double getMultiResult(String s) {
        Pattern pattern = Pattern.compile("\\*");
        String[] str1 = pattern.split(s);
        Double[] number = new Double[str1.length];
        int numberIndex = 0;
        double multiResult = 1;
        for (int i = 0; i < str1.length; i++)
            try {
                number[numberIndex] = Double.parseDouble(str1[i]);
                multiResult *= number[numberIndex];
                numberIndex++;
            } catch (NumberFormatException e) {
                multiResult *= getDivisionResult(str1[i]);
            }
        return multiResult;
    }

    private double getPowerResult(String s) {
        CalculatorWithMath calc = new CalculatorWithMath();
        Pattern pattern = Pattern.compile("\\^");
        String[] str1 = pattern.split(s);
        Double[] number = new Double[str1.length];
        int numberIndex = 0;
        double powerResult = 1;
        if (str1.length == 2) {powerResult=calc.getDegreeOf(Double.parseDouble(str1[0]), Double.parseDouble(str1[1]));
        }
        return powerResult;


    }

    private double getDivisionResult(String s) {
        Pattern pattern = Pattern.compile("\\/");
        String[] str1 = pattern.split(s);
        Double[] number = new Double[str1.length];
        int numberIndex = 0;
        double divisionResult = 1;
        switch (str1.length) {
            case 0:
                break;
            case 1: {
                try {
                    divisionResult = Double.parseDouble(str1[0]);
                    break;
                } catch (NumberFormatException e) {
                    divisionResult = getBracketResult(str1[0]);
                    break;
                }
            }
            case 2: {
                try {
                    divisionResult = Double.parseDouble(str1[0]) / Double.parseDouble(str1[1]);
                    break;
                } catch (NumberFormatException e) {
                    divisionResult = getBracketResult(str1[0] + str1[1]);
                    break;
                }
            }
        }
        if (str1.length > 2) {
            for (int i = 1; i < str1.length; i++)
                try {
                    divisionResult /= Double.parseDouble(str1[i]);
                } catch (NumberFormatException e) {
                    divisionResult /= getBracketResult(str1[i]);

                }
        }
        return divisionResult;
    }

    private double getBracketResult(String s) {
        try {
            Pattern pattern = Pattern.compile("[()]");
            String[] str1 = pattern.split(s);
            return getPlusResult(str1[0]);
        } catch (NumberFormatException e) {
            return getPlusResult(s);

        }
    }
}