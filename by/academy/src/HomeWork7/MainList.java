package HomeWork7;

import HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.bin"));
        List<Person> student = new ArrayList<>();
        while (true) {
            try {
                student.add((Person) in.readObject());
            } catch (EOFException e) {
                break;
            }
        }
        student.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getNick().compareTo(o2.getNick());
            }
        });

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortList.bin"));
        for (Person person : student) {
            out.writeUnshared(person);
        }
        out.close();


    }
}
