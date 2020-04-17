package HomeWork5;

public class EasySearch implements ISearchEngine {
    @Override
    public void seach(String book, String word) {
        String regex = "\\.|!|,|\\?|\\(|\\)|-|\"|\\|\t|\n|\\*";
        book = book.replaceAll(regex, " ");
        int counter = 0;
        for (int i = 0; i < book.length(); i++) {
            if (book.indexOf(word, i) != -1) {
                counter++;
                i=book.indexOf(word, i);
            }
        }
        System.out.println("Слово "+word+" встречается в тексте "+counter+" раз;");
    }

}
