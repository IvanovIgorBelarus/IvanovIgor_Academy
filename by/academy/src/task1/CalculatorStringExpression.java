package task1;

/*
Вычисление выражения происходит с помощью постепенной обработки частей выражения. Каждый метод обрабатывает отдельный
кусочек строки (тот, который он знает как обработать) и передает остаток строки дальше, следующему методу В свою очередь
последний вызванный метод возвращает необработанный кусок строки первому методу. Таким образом обработка строки происходит
до тех пор, пока есть что обрабатывать. Используется следующий алгоритм приоритетов операторов:
"+" -> "-" -> "*" -> "/"->"^".
P.s. Не решенные проблемы CalculatorStringExpression
1. Не верно обрабатывает строки со скобками;
2. Не знает действие оператора"||";
3. Не контролирует допустие символы (числа, операторы, скобки, константы);
 */
public class CalculatorStringExpression {
    public void getStringResult(String string) {
        string = string.replaceAll("PI","3.14");
        string = string.replaceAll("E","2.72");
        string = string.replaceAll(" ","");
        System.out.println(getPlus(string));
    }

    private double getPlus(String s) {
        double sum = 0;
        if (s.length() == 0) {
            return sum;
        }
        String[] str1 = s.split("\\+");
        for (int i = 0; i < str1.length; i++) {
            try {
                sum += Double.parseDouble(str1[i]);
            } catch (Exception e) {
                sum += getMinus(str1[i]);
            }
        }
        return sum;
    }

    private double getMinus(String s) {
        double sum = 0;
        if (s.length() == 0) {
            return sum;
        }
        String[] str1 = s.split("-");
        try {
            sum = Double.parseDouble(str1[0]);
        } catch (Exception e) {
            sum = getMulti(str1[0]);
        }
        for (int i = 1; i < str1.length; i++)
            try {
                sum -= Double.parseDouble(str1[i]);
            } catch (Exception e) {
                sum -= getMulti(str1[i]);
            }
        return sum;
    }

    private double getMulti(String s) {
        double multiResult = 1;
        if (s.length() == 0) {
            return multiResult;
        }
        String[] str1 = s.split("\\*");

        for (int i = 0; i < str1.length; i++)
            try {
                multiResult *= Double.parseDouble(str1[i]);
            } catch (Exception e) {
                multiResult *= getDivision(str1[i]);
            }
        return multiResult;
    }

    private double getPower(String s) {
        CalculatorWithMath calc = new CalculatorWithMath();
        String[] str1 = s.split("\\^");
        double powerResult = 1;
        if (str1.length == 2) {
            powerResult = calc.getDegreeOf(Double.parseDouble(str1[0]), Double.parseDouble(str1[1]));
        }
        return powerResult;
    }

    private double getDivision(String s) {
        double divisionResult = 1;
        if (s.length() == 0) {
            return divisionResult;
        }
        String[] str1 = s.split("/");
        switch (str1.length) {
            case 1: {
                try {
                    divisionResult = Double.parseDouble(str1[0]);
                    break;
                } catch (Exception e) {
                    divisionResult = delBracket(str1[0]);
                    break;
                }
            }
            case 2: {
                try {
                    divisionResult = Double.parseDouble(str1[0]) / Double.parseDouble(str1[1]);
                    break;
                } catch (Exception e) {
                    divisionResult = delBracket(str1[0] + str1[1]);
                    break;
                }
            }
        }
        if (str1.length > 2) {
            for (int i = 1; i < str1.length; i++)
                try {
                    divisionResult /= Double.parseDouble(str1[i]);
                } catch (Exception e) {
                    divisionResult /= delBracket(str1[i]);

                }
        }
        return divisionResult;
    }

    private double delBracket(String s) {
        return getPower(s);
    }
}