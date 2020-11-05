package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCountFrequency {

    public static void main(String[] args) {
        String str = "this is a dog and this is a cat";

        List <String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map <String, Integer > wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        System.out.println(wordCounter);

        Map<String, Integer> result = wordCounter.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(result);

        Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collections.reverseOrder());
        reverseSortedMap.putAll(wordCounter);
        System.out.println("Reverse Sorted Order ::"+reverseSortedMap);
    }
}

/**
Output
{a=2, and=1, cat=1, this=2, is=2, dog=1}
{a=2, and=1, cat=1, dog=1, is=2, this=2}
Reverse Sorted Order ::{this=2, is=2, dog=1, cat=1, and=1, a=2}
 */