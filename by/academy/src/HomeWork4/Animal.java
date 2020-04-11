package HomeWork4;

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
}
