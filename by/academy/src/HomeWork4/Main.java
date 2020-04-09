package HomeWork4;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int counter=100000;
        Person[] person = new Person[counter];
        DataContainer<Person> dataContainerPerson = new DataContainer<>(person);
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person(setNick(), setPassword(), setRegistration());
            dataContainerPerson.add(person);
        }
        System.out.println("Person container: ");
        dataContainerPerson.getData();
        System.out.println();
        System.out.println();


        System.out.println("Animal container:");
        Animal[] animal = new Animal[counter];
        DataContainer<Animal> dataContainerAnimal = new DataContainer<>(animal);
        for (int i = 0; i < animal.length; i++) {
            animal[i] = new Animal(setNick(), setAge());
            dataContainerAnimal.add(animal);
        }
        dataContainerAnimal.getData();
    }

    private static String setNick() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int letterNumber;
        char letter;
        String variableString = new String();
        for (int l = 0; l < 6; l++) {
            letterNumber = (int) (Math.random() * 25);
            letter = alphabet.charAt(letterNumber);
            variableString += letter;

        }
        return variableString;
    }

    private static String setPassword() {
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

    private static LocalDate setRegistration() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1920, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate registrationDate = LocalDate.ofEpochDay(randomDay);
        return registrationDate;
    }

    private static int setAge() {
        Random random = new Random();
        int min = 1;
        int max = 30;
        return random.nextInt(max - min + 1);
    }

}
