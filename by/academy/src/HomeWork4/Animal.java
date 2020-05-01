package HomeWork4;

import java.util.Objects;

public class Animal {
    String nick;
    int age;

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{nick:" + nick + "; Age:" + age + " } ";
    }

    @Override
    public boolean equals(Object obj) {
        Animal animal=(Animal) obj;
        return nick==animal.nick&&age==animal.age&&hashCode()==animal.hashCode();
    }
    public int hashCode() {
        return Objects.hash(nick, age);
    }
}
