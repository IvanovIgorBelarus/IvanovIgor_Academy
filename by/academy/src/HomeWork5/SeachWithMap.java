package HomeWork5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SeachWithMap implements ISearchEngine {
    static Map<String, Integer> counter = new HashMap<>();

    private static Map<String, Integer> getMap(String book) {
        if (counter.size() != 0) return counter;
        String regex = " |\\.|!|,|\\?|\\(|\\)|-|\"|\\|\t|\n|\\*";
        String[] words = book.split(regex);
        for (String s : words) {
            if (counter.containsKey(s))
                counter.put(s, counter.get(s) + 1);
            else counter.put(s, 1);
        }
        return counter;
    }

    public static void printMap() {
        int count = 0;
        for (Map.Entry entry : counter.entrySet()) {
            count++;
            if (count == 20) {
                System.out.println();
                count = 0;
            }
            System.out.print(entry.getKey() + " - "
                    + entry.getValue() + " ; ");
        }
    }

    public static void printSortMap() {
        Map<Object, Object> counterSort = new TreeMap<>();
        for (Map.Entry counter : counter.entrySet()) {
            counterSort.put(counter.getValue(), counter.getKey());
        }
        int count = 0;
        for (Map.Entry entry : counterSort.entrySet()) {
            count++;
            if (count == 20) {
                System.out.println();
                count = 0;
            }
            System.out.print(entry.getKey() + " - "
                    + entry.getValue() + " ; ");
        }


    }

    public void seach(String book, String word) {
        getMap(book);
        System.out.println("Слово " + word + " встречается в тексте " + counter.get(word) + " раз;");
    }


}


