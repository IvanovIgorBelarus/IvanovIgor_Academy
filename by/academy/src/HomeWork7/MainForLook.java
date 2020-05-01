package HomeWork7;

import HomeWork4.Person;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainForLook {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("sortList.bin"));
        List<Person> student = new ArrayList<>();
        while (true) {
            try {
                student.add((Person) in.readObject());
            } catch (EOFException e) {
                break;
            }
        }
        for (Person person : student) {
            System.out.println(person.toString());
        }
        System.out.println(student.size());
    }
}
