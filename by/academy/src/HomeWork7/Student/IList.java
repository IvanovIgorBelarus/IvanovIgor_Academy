package HomeWork7.Student;

import HomeWork4.Person;

import java.io.IOException;
import java.util.List;

public interface IList {
    List<Person> creatListFromFile(String fileName, List<Person> student ) throws IOException, ClassNotFoundException;
    void sortList(List<Person> student);
    void saveList (String fileName,List<Person> student ) throws IOException;
}
