package WarmUp;

public class WarmUp {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;

    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n < 21) {
            return Math.abs(n - 21);
        }
        return 2 * Math.abs(n - 21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7 || talking && hour > 20) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        }
        return false;

    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((a > 0 && b < 0 && !negative) || (a < 0 && b > 0 && !negative) || (a < 0 && b < 0 && negative))
            return true;
        return false;
    }

    public String notString(String str) {
        if (str.length() > 2)
            if (str.substring(0, 3).equals("not"))
                return str;
            else return "not " + str;
        else return "not " + str;

    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);

    }

    public String frontBack(String str) {
        if ((str.length() > 0) && (str.length() > 1))
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        return str;

    }

    public String front3(String str) {
        if (str.length() >= 3)
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
        return str + str + str;
    }

    public String backAround(String str) {
        if (str.length() > 1)
            return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);
        return str + str + str;
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) return true;
        return false;

    }

    public String front22(String str) {
        if (str.length() > 2)
            return str.substring(0, 2) + str + str.substring(0, 2);
        return str + str + str;
    }

    public boolean startHi(String str) {
        if (str.length() > 1)
            if (str.substring(0, 2).equals("hi"))
                return true;
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0))
            return true;
        return false;

    }

    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20) return true;
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
            return true;
        return false;

    }

    public boolean loneTeen(int a, int b) {
        int k = 0;
        if (a >= 13 && a <= 19) k++;
        if (b >= 13 && b <= 19) k++;
        if (k == 1)
            return true;
        return false;
    }

    public String delDel(String str) {

        if (str.length() > 3)
            if (str.substring(1, 4).equals("del"))
                return str.substring(0, 1) + str.substring(4);
        return str;

    }

    public boolean mixStart(String str) {
        if (str.length() > 2)
            if (str.substring(1, 3).equals("ix")) return true;
        return false;

    }

    public String startOz(String str) {
        String str1 = "";
        if (str.length() > 1 && str.substring(0, 2).equals("oz")) {
            str1 = "oz";
            return str1;
        }
        if (str.length() > 0 && str.substring(0, 1).equals("o")) str1 += "o";
        if (str.length() > 1 && str.substring(1, 2).equals("z")) str1 += "z";
        return str1;


    }

    public int intMax(int a, int b, int c) {
        if (a > b)
            if (a > c) return a;
            else return c;
        else if (b > c) return b;
        return c;
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) return a;
        if (Math.abs(a - 10) > Math.abs(b - 10)) return b;
        return 0;

    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) return true;
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) return true;
        return false;
    }

    public int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && a > b) return a;
        if (b >= 10 && b <= 20 && b > a) return b;
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;

        return 0;
    }

    public boolean stringE(String str) {
        int k = 0;
        if (str.length() > 0)
            for (int i = 0; i <= str.length() - 1; i++)
                if (str.substring(i, i + 1).equals("e")) k++;
        if (k >= 1 && k <= 3) return true;
        return false;


    }

    public boolean lastDigit(int a, int b) {
        if (a == b % 10 || a % 10 == b || a == b) return true;
        return false;
    }

    public String endUp(String str) {
        if (str.length() > 0 && str.length() < 3) return str.toUpperCase();
        if (str.length() > 3)
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
        return "";
    }

    public String everyNth(String str, int n) {
        String str1 = str.substring(0, 1);
        int k = n;
        if (n > str.length()) return str1;
        for (int i = 0; i < (str.length()); i++) {
            if (i == k) {
                str1 = str1 + str.substring(i, i + 1);
                k += n;
            }
        }
        if (str.length() == k + 1) str1 += str.substring(str.length() - 1);

        return str1;

    }


}
