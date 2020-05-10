package HomeWork8.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternParser implements IPatternParser {
    @Override
    public String replace(String regex, String string){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(string);
        return matcher.replaceAll(" "+regex);
    }
    @Override
    public List saveInList(String string) {
        Pattern pattern=Pattern.compile(".*? ");
        Matcher matcher=pattern.matcher(string);
        List nameOfDomens= new ArrayList<String>();
        while (matcher.find()){
            nameOfDomens.add(matcher.group(0).replace(" ",""));
        }
        return nameOfDomens;
    }

}
