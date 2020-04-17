package HomeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class MainWap {
    public static void main(String[] args) {
        String s = readAllBytesJava7("E:\\Курсы Java\\Война и мир.txt");
        s = s.toLowerCase();

        System.out.println("С помощью indexOf:");
        EasySearch search = new EasySearch();
        search.seach(s, "война ");
        search.seach(s, " и ");
        search.seach(s, " мир ");

        System.out.println("С помощью Мар:");
        SeachWithMap search1 = new SeachWithMap();
        search1.seach(s, "война");
        search1.seach(s, "и");
        search1.seach(s, "мир");


    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}