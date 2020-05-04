package HomeWork7.Student;

import HomeWork4.Person;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public interface IWorkWithFile<E> {
    /*
      @param fileName - строка, обозначающая имя файла, из которого извлекаются данные;
      @param List<T> t - List, в который будет сохранен результат;
       */
    List<E> creatListFromFile(String fileName) throws IOException, ClassNotFoundException;
    void saveList(String fileName, List<E> student) throws IOException;
}
