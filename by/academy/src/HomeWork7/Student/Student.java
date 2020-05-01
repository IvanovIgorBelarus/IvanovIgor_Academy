package HomeWork7.Student;

import HomeWork4.Person;

import java.io.*;
import java.util.Comparator;
import java.util.List;

public class Student implements IList {
    public void generatorOfStudents(String fileName, int numberOfStudents)throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        for (int i = 0; i < numberOfStudents; i++) {
            out.writeObject(new Person(Person.setNick(), Person.setPassword(), Person.setRegistration()));
        }
        out.close();
    }
    @Override
    public List<Person> creatListFromFile(String fileName, List<Person> student) throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        while (true) {
            try {
                student.add((Person) in.readObject());
            } catch (EOFException e) {
                break;
            }
        }
        in.close();
        return student;
    }

    @Override
    public void sortList(List<Person> student) {
        student.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getNick().compareTo(o2.getNick());
            }
        });
    }

    @Override
    public void saveList(String fileName, List<Person> student) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        for (Person person : student) {
            out.writeUnshared(person);
        }
        out.close();

    }
}
