package HomeWork5;

import java.util.Map;
import java.util.TreeMap;

public class SeachWithMap implements ISearchEngine  {
    public void seach(String book, String word) {
        Map<String, Integer> counter = new TreeMap<>();
        String regex = " |\\.|!|,|\\?|\\(|\\)|-|\"|\\|\t|\n|\\*";
        String[] words = book.split(regex);
        for (String s : words) {
            if (counter.containsKey(s))
                counter.put(s, counter.get(s) + 1);
            else counter.put(s, 1);
        }
        System.out.println("Слово "+word+" встречается в тексте "+counter.get(word)+" раз;");

    }
}
