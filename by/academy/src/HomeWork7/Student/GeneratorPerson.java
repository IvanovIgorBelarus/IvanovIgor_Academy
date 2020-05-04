package HomeWork7.Student;

import HomeWork4.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GeneratorPerson {
    public static void generator(String fileName, int number) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        try {
            for (int i = 0; i < number; i++) {
                out.writeObject(new Person(Person.setNick(), Person.setPassword(), Person.setRegistration()));
            }
        } catch (IOException e) {
            throw e;
        } finally {
            out.close();
        }
    }
}

