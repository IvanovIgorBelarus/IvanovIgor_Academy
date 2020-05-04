package HomeWork7.Student;

import HomeWork4.Person;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public interface IWorkWithFile<E> {
    /*
      @param fileName - строка, обозначающая имя файла, из которого извлекаются данные;
       */
    List<E> creatListFromFile(String fileName) throws IOException, ClassNotFoundException;
    /*
    @param fileName - строка, обозначающая имя файла, в который сохраняется List<E>;
    @param List<E> e - List, который будет сохранен в файл;
     */
    void saveList(String fileName, List<E> student) throws IOException;
}
