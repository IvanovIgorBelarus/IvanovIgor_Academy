package HomeWork2.task1;

public class main {
    public static void main(String[] args) {
        System.out.println(Countries.valueOf("RUSSIA")==Countries.RUSSIA);
        //System.out.println(Countries.valueOf("BELARUS"));   Exception in thread "main" java.lang.IllegalArgumentException: No enum constant HomeWork2.task1.Countries.BELARUS
    }
}
