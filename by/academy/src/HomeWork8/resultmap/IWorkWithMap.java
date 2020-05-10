package HomeWork8.resultmap;

import java.util.HashMap;
import java.util.List;

public interface IWorkWithMap {
     HashMap seachRegexResult(List<String> list, String regex, int group);
     void printMap(HashMap map);

}
