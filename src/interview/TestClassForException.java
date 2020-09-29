package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassForException {

    public static void main(String[] args) {

      List<Integer> list = Arrays.asList( 2,4,6,8);
      list.stream().map( i->i*2 ).collect( Collectors.toList() ).forEach( System.out::println);

    }
}

