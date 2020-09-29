package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

    public static void main(String[] args) {
        System.out.println("https://www.youtube.com/watch?v=Gsfmfeb2XW8");

        List<Integer> list = Arrays.asList(1,2,3,5,4,6,7,8,9,10);

        List<String> name1 = Arrays.asList( "Priya", "John", "Pavlo" );
        List<String> name2 = Arrays.asList( "Urvi", "David","John" ,"Priya");
        //sum of numbers
        System.out.println(
                list.stream().map(e->e*2)
                .reduce( 0, Integer::sum )
        );

        //find the double of first even number that is greater than 3
        System.out.println(
                    list.stream()
                        .filter( Lambda :: isGT3)
                            .filter( Lambda::isEven )
                            .map(Lambda::doubleInt)
                            .findFirst());

        //union of names from list
        List<String> unionNames = Stream.of( name1, name2 ).flatMap( x->x.stream() ).collect( Collectors.toList());
        System.out.println("Union of names list :: "+unionNames);

        //common names from list
        List<String> commonNames = name1.stream().filter( name2 :: contains ).collect( Collectors.toList());
        System.out.println("Common names from list :: "+commonNames);
    }



    private static boolean isGT3(int numbers){
       // System.out.println("isGT3 for "+numbers);
        return numbers>3;
    }

    private static boolean isEven(int numbers){
       // System.out.println("isEven for "+numbers);
        return numbers%2==0;
    }

    private static int doubleInt(int numbers){
      //  System.out.println("doubleInt for "+numbers);
        return numbers*2;
    }

}
