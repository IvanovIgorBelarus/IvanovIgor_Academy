package HomeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainWap {
    public static void main(String[] args) {
        String s = readAllBytesJava7("E:\\Курсы Java\\Война и мир.txt");
        s = s.toLowerCase();

        System.out.println("С помощью indexOf:");
        EasySearch search = new EasySearch();
        long start = System.currentTimeMillis();
        System.out.println(search.seach(s, "война "));
        System.out.println(search.seach(s, " и "));
        System.out.println(search.seach(s, " мир "));
        long finish = System.currentTimeMillis();
        System.out.println("время обработки IndexOf: "+(finish-start));
        System.out.println();

        System.out.println("С помощью Мар:");
        SeachWithMap search1 = new SeachWithMap();
        long start1 = System.currentTimeMillis();
        System.out.println(search1.seach(s, "война"));
        System.out.println(search1.seach(s, "и"));
        System.out.println(search1.seach(s, "мир"));
        long finish1 = System.currentTimeMillis();
        System.out.println("время обработки Map: "+(finish1-start1));
//        SeachWithMap.printMap();
//        SeachWithMap.printSortMap();

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