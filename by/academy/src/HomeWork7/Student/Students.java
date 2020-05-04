package HomeWork7.Student;

import HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Students<E> implements IWorkWithFile {
    /*
        @param fileName - строка, обозначающая имя файла, в который будет сохранён результат генерации;
        @param numberOfStudents - число результатов генерации;
        */
    public Students(String fileName, int numberOfStudents) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        try {
            for (int i = 0; i < numberOfStudents; i++) {
                out.writeObject(new Person(Person.setNick(), Person.setPassword(), Person.setRegistration()));
            }
        } catch (IOException e) {
            throw e;
        } finally {

            out.close();
        }
    }

    @Override
    public List<E> creatListFromFile(String fileName) throws IOException, ClassNotFoundException {
        List<E> student = new ArrayList<>();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        while (true) {
            try {
                student.add((E) in.readObject());
            } catch (EOFException e) {
                break;
            }
        }
        in.close();
        return student;
    }

    @Override
    public void saveList(String fileName, List student) throws IOException {
        ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(fileName));
        for (Object o : student) {
            save.writeUnshared(o);
        }
        save.close();
    }
}
