package HomeWork7;

import HomeWork4.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*1. Создать мэйн в котором будут генерироваться студенты. 100 тыс в список.
         Использовать метод writeObject. После этого сохранить эту информацию в файл.

        через класс Student решил эту задачу в один Main, надеюсь, ничего страшного =)
         */
        Student student=new Student();
        /*
         @param fileName - строка, обозначающая имя файла, в который будет сохранён результат генерации;
         @param numberOfStudents - число результатов генерации;
         */
        student.generatorOfStudents("students.bin",100000);

        /*
        2. Создать мэйн в котором прочитать данный файл. Сохранить всех студентов в список.
        Прошу учесть что на момент написание второго мэйна вы не знаете точное количество студентов в файле

        ниже идет второй Main
         */
        List<Person> studentList = new ArrayList<>();
        /*
        @param fileName - строка, обозначающая имя файла, из которого извлекаются данные;
        @param List<T> t - List, в который будет сохранен результат;
         */
        studentList=student.creatListFromFile("students.bin",studentList);

        /*
        3. Отсортировать студентов по алфавиту и сохранить информацию в новый файл но уже сохранять не объекты
        через writeObject а поля объектов через другие методы writeXXX;

        использовал метод writeUnshared в методе saveList;
         @param List<T> t - List, в который будет отсортирован;
         */
        student.sortList(studentList);

        /*
         @param fileName - имя файла, в который будет сохранён List;
         @param studentList - List, который необходимо сохранить;
         */
        student.saveList("sortlist.bin",studentList);

        /*
        Сделал проверку сохраненного в файл sortlist.bin результата
         */
        List<Person> lookResults = new ArrayList<>();
        lookResults=student.creatListFromFile("sortlist.bin",lookResults);
        for (Person person : lookResults) {
            System.out.println(person);

        }


    }
}

