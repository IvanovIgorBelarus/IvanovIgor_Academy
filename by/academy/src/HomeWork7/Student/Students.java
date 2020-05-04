package HomeWork7.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Students<E> implements IWorkWithFile {
    /*
        @param fileName - строка, обозначающая имя файла, в который будет сохранён результат генерации;
        @param numberOfStudents - число результатов генерации;
        */
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
