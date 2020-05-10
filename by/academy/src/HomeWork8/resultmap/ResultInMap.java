package HomeWork8.resultmap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResultInMap implements IWorkWithMap {

    @Override
    public HashMap seachRegexResult(List<String> list, String regex, int group) {
        HashMap <String, Integer>result=new HashMap<>();
        Pattern pattern = Pattern.compile(regex);
        for (String o : list) {
            Matcher matcher=pattern.matcher(o);
            if (matcher.find()) {
                if (result.containsKey(matcher.group(group)))
                    result.put(matcher.group(group),result.get(matcher.group(group))+1);
                else { result.put(matcher.group(group),1);}
            }
        }

        return result;
    }

    @Override
    public void printMap(HashMap map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println);
//        for ( Object key : map.keySet()) {
//            System.out.println("Domen= "+key+", value= "+map.get(key));
//        }


    }
}
