package HomeWork4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;

public class Person implements Serializable {
    String nick;
    String password;
    LocalDate registration;
    public Person(String nick, String password,LocalDate registration){
        this.nick=nick;
        this.password=password;
        this.registration=registration;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "{nick:" + nick + "; password:" + password + "; registration:" + registration + " } ";
    }

    @Override
    public boolean equals(Object obj) {
        Person person=(Person)obj;
        return person.nick==nick&&person.password==password&&person.registration==registration;
    }
    public static String setNick() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterNumber;
        char letter;
        String variableString = new String();
        for (int l = 0; l < 6; l++) {
            letterNumber = (int) (1+Math.random() * 25);
            letter = alphabet.charAt(letterNumber);
            variableString += letter;

        }
        return variableString;
    }

    public static String setPassword() {
        String password = "0123456789";
        int letterNumber;
        char letter;
        String variableString = new String();
        for (int l = 0; l < 6; l++) {
            letterNumber = (int) (Math.random() * 8);
            letter = password.charAt(letterNumber);
            variableString += letter;
        }
        return variableString;
    }

    public static LocalDate setRegistration() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1920, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate registrationDate = LocalDate.ofEpochDay(randomDay);
        return registrationDate;
    }
}
