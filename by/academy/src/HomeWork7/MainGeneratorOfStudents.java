package HomeWork7;

import HomeWork4.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainGeneratorOfStudents  {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.txt"));
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            out.writeObject(new Person(Person.setNick(), Person.setPassword(), Person.setRegistration()));
        }
        long finish = System.currentTimeMillis();
        out.flush();
        long finish1 = System.currentTimeMillis();
        System.out.println("1:"+(finish-start)+"  2:"+(finish1-start));
        out.close();
    }
}

