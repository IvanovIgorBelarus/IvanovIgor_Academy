package HomeWork6.task1;

import java.util.LinkedList;
import java.util.List;

public class MainStackOverflowError {
    public static void main(String[] args) {

        for (; ; ) {
            try {
                ErrorClass error = new ErrorClass();
            } catch (StackOverflowError e) {
                System.out.println("Sorry, but you have StackOverflowError");
                break;

            }

        }

    }
}
