package HomeWork7;

import HomeWork4.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainGeneratorOfStudents  {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.bin"));
        for (int i = 0; i < 100000; i++) {
            out.writeObject(new Person(Person.setNick(), Person.setPassword(), Person.setRegistration()));
        }
        out.close();
    }
}

