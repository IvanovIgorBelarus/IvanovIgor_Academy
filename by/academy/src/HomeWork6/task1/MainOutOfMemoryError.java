package HomeWork6.task1;

import java.util.LinkedList;
import java.util.List;

public class MainOutOfMemoryError {
    public static void main(String[] args) throws OutOfMemoryError {
        List<ErrorClass> errors = new LinkedList<>();
        String string = "error";
        for (; ; ) {
            try {
                string += "error";
                errors.add(new ErrorClass(string));
            } catch (OutOfMemoryError e) {
                throw e;
            }
            throw new OutOfMemoryError("sorry, you have OutOfMemoryError");
        }

    }
}
