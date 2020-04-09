package HomeWork4;

import java.time.LocalDate;

public class Person {
    String nick;
    String password;
    LocalDate registration;
    public Person(String nick, String password,LocalDate registration){
        this.nick=nick;
        this.password=password;
        this.registration=registration;
    }
    @Override
    public String toString() {
        return "{nick:" + nick + "; password:" + password + "; registration:" + registration + " }. ";
    }
}
