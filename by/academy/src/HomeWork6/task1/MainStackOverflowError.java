package HomeWork6.task1;

import java.util.LinkedList;
import java.util.List;

public class MainStackOverflowError {
    public static void main(String[] args) {
        List<ErrorClass> errors = new LinkedList<>();
        for (; ; ) {
            try {
                errors.add(new ErrorClass());
            } catch (StackOverflowError e) {
                throw e;
            }
            throw new StackOverflowError("sorry, you have StackOverflowError");
        }
    }
}
