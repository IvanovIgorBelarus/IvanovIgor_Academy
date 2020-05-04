package HomeWork7;

import HomeWork4.Person;
import HomeWork7.Student.GeneratorPerson;
import HomeWork7.Student.IWorkWithFile;
import HomeWork7.Student.Students;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*1. Создать мэйн в котором будут генерироваться студенты. 100 тыс в список.
         Использовать метод writeObject. После этого сохранить эту информацию в файл.

        через класс Student решил эту задачу в один Main, надеюсь, ничего страшного =)
         */
        IWorkWithFile student=new Students();
        GeneratorPerson.generator("students.bin",100000);

        /*
        2. Создать мэйн в котором прочитать данный файл. Сохранить всех студентов в список.
        Прошу учесть что на момент написание второго мэйна вы не знаете точное количество студентов в файле

        ниже идет второй Main
         */
        List<Person> studentList = student.creatListFromFile("students.bin");

        /*
        3. Отсортировать студентов по алфавиту и сохранить информацию в новый файл но уже сохранять не объекты
        через writeObject а поля объектов через другие методы writeXXX;
        использовал метод writeUnshared в методе saveList;
         */
        studentList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getNick().compareTo(o2.getNick());
            }
        });
        student.saveList("sortlist.bin",studentList);
        /*
        Сделал проверку сохраненного в файл sortlist.bin результата
         */
        List<Person> lookResults = student.creatListFromFile("sortlist.bin");
        for (Person person : lookResults) {
            System.out.println(person);
        }
    }
}

