package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Patterns {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum of Total Values :: "+ totalValues( list, e->true ));
        System.out.println("Sum of Even numbers :: "+ totalValues( list, e->e%2==0 ));
        System.out.println("Sum of Odd numbers :: "+totalValues( list, e->e%2!=0 ));

        Function<Integer, Integer> inc = e->e+1;
        Function<Integer, Integer> doubleIt = e->e*2;
        doWork( 5, inc );
        doWork( 5, doubleIt );
        doWork( 5, inc.andThen( doubleIt ) );
    }

    //Iterator and Strategy Pattern
    private static int totalValues(List<Integer> values, Predicate<Integer> selector){
        return values.stream().filter( selector ).reduce( 0, Integer::sum );
    }

    //Decorator Pattern
    private static void doWork(int value, Function<Integer, Integer> func){
        System.out.println(func.apply( value ));
    }
    //Builder Pattern
    Mailer mailer = new Mailer()
            .from( "priyanka.varma@epam.com" )
            .to( "build.agile@developer.com" )
            .subject( "Test of Builder Pattern" )
            .body( "Welcomer onboard!!" ).send();

}


class Mailer {

    public Mailer from(String from){
        System.out.println("From : ");
        return this;
    }

    public Mailer to(String to){
        System.out.println("to");
        return this;
    }

    public Mailer subject(String subject){
        System.out.println("Subject");
        return this;
    }

    public Mailer body(String body){
        System.out.println("Body");
        return this;
    }

    public Mailer send(){
        System.out.println("Sending....");
        return this;
    }
}
