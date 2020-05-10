package HomeWork8.parser;

import java.util.List;

public interface IPatternParser {
    /*
    @param regex - выражение, по которому проводится поиск для замены символов;
    @param string - строка, в которой проводится поиск;
    @return строку, которая содержит в себе внесенные изменения;
     */
    String replace (String regex, String string);
    List saveInList(String string);



}
