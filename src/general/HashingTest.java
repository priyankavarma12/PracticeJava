package general;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashingTest {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();

        DataKey dk = new DataKey();
        dk.setId( 1 );
        dk.setName( "John" );
        System.out.println("MainMethod DataKey hashcode :: "+dk.hashCode());

        Integer value = hm.get( dk );
        System.out.println("Value is :: "+value);

        System.out.println("Distinct Values ::");
        getDistinctValue();

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId( 1 );
        dk.setName( "John" );
        System.out.println("GetAll DataKey hashcode :: "+dk.hashCode());

        hm.put( dk, 10 );
        return hm;
    }

    private static void getDistinctValue(){
        Map<Integer, String> map = new HashMap<>(  );
        map.put( 1, "Priyanka" );
        map.put(2, "John");
        map.put(3, "Priyanka");
        map.put(4, "John");
        map.put(5, "Lisa");
        map.put(6, "Lisa");
        map.put(7, "John");

        map.entrySet().stream().distinct().forEach( System.out::println);

    }


}
