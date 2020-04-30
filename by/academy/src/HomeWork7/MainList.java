package HomeWork7;

import HomeWork4.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MainList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.txt"));
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

//        BufferedWriter out=new BufferedWriter(new FileWriter("sortList.txt"));
//        for (Person person : student) {
//                  out.append(person.toString()+"\n");
//        }

//        DataOutputStream out = new DataOutputStream(new FileOutputStream("sortList.txt"));
//        for (Person person : student) {
//            out.writeBytes(person.toString()+"\n");
//        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sortList.txt"));
        for (Person person : student) {
            out.writeUTF(person.toString()+"\n");
            out.flush();
        }
        out.close();

    }
}
