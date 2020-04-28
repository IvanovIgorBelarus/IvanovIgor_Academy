package HomeWork6.task1;

public class ErrorClass {
    String string;
    static String put="error";

    ErrorClass(String string) {
       this.string=string;
    }
    ErrorClass() {
        setString();
    }

     void setString() {
        put+="error";
        this.string = string+put;
    }
}
