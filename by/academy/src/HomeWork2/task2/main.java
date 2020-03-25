package HomeWork2.task2;

import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {
//        2.1. {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}
//        2.2. {1,1,2,-2,5,2,4,4,-1,-2,5}
//        2.3. {20,1,1,2,2,3,3,5,5,4,20,4,5}
//        2.4. {10}
//        2.5. {1,1,1,1,1,1,10,1,1,1,1}
//        2.6. {5,4,3,2,1,5,4,3,2,10,10}
        int[] array = {5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10};
        int pos = -1;
        for (int i = 0; i <= array.length - 1; i++) {
            int kol = 0;
            for (int j : array) {
                if (array[i] == j) kol++;
            }
            if (kol % 2 != 0) pos = i;
        }
        if (pos != -1) System.out.println(array[pos]);
        else System.out.println("no such number, try again! -)");
    }


}

