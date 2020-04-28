package Test.Fibonacci;

public class Fibonacci {

    static void java(int b) {
        if (b <= 0) {
            System.out.println("error");
            return;
        }
        long last=1;
        long last2=1;
        long result;
        for (int i = 1; i <= b; i++) {
            switch (i) {
                case 1:
                case 2: {
                    System.out.print(1 + " ");
                    break;
                }
                default:{
                    result=last+last2;
                    System.out.print(result+" ");
                    last2=last;
                    last=result;
                    break;
                }


            }
        }


    }
}
