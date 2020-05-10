package HomeWork8;

import HomeWork8.domens.Domens;
import HomeWork8.parser.IPatternParser;
import HomeWork8.parser.PatternParser;
import HomeWork8.resultmap.IWorkWithMap;
import HomeWork8.resultmap.ResultInMap;

import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        /*парсинг строки на отдельные домены я решил провести через
        вставку пробела перед протоколом, чтобы потом было проще делать
        Pattern для поиска необходимых доменов
         */
        IWorkWithMap result=new ResultInMap();
        IPatternParser pars = new PatternParser();

        String s = pars.replace("http://", Domens.urls);
        s = pars.replace("https://", s);
        s = pars.replace("ftp://", s);
        List<String> nameOfDomens = pars.saveInList(s);
        /*
        выводим список доменов
         */
        System.out.print("полный список доменов:");
        for (Object o : nameOfDomens) {
            System.out.println(o);
        }
        System.out.println("__________________");
        /*
        //Добавить ТОП протоколов
         */
        System.out.println("топ протоколов:");
        String regexProtocol = "(\\w{3,5})://";
        HashMap topProtocols = result.seachRegexResult(nameOfDomens, regexProtocol,1);
        result.printMap(topProtocols);
        System.out.println("__________________");

        /*
        Добавить ТОП доменов
         */
        System.out.println("топ доменов:");
        String regexDomens = "(.*)?(\\.[a-z]{2,4})";
        HashMap topDomens = result.seachRegexResult(nameOfDomens, regexDomens,2);
        result.printMap(topDomens);
        System.out.println("__________________");
        /*
        Добавить ТОП национальных доменов
         */
        System.out.println("топ национальных доменов:");
        String regexNationalDomens = "(.*)?(\\.(su|de|ru|by))";
        HashMap topNationalDomens = result.seachRegexResult(nameOfDomens, regexNationalDomens,2);
        result.printMap(topNationalDomens);










    }
}
