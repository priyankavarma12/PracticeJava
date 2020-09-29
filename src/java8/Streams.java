package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        System.out.println("https://www.youtube.com/watch?v=rVfRDLIw_Zw");
        List<Person> people = createPeople();
        List<String> names = new ArrayList<>();
        //get, in uppercase, the names of all female older than 18
        for(Person person : people){
            if(person.getAge()>18){
                names.add( person.getName().toUpperCase() );
            }
        }
        System.out.println(names);

        //streams
        List<String> names2 =  people.stream()
                .filter( person -> person.getAge()>18 )
                .map( Person::getName )
                .map( String::toUpperCase )
                .collect( Collectors.toList());
        System.out.println(names2);

        //we are transforming the collection instead of mutating it
        people.stream().filter( person -> person.getGender() == Gender.MALE )
                .map(person -> new Person( person.getName().toUpperCase(), person.getAge(), person.getGender() ))
                //.map( person -> person.getName().toUpperCase())
                .forEach( System.out::println);

        //total age of everybody
        System.out.println(people.stream()
                .mapToInt( Person::getAge ).sum());


        //Oldest people
        System.out.println(
                people.stream()
                .max((p1,p2) -> p1.getAge() > p2.getAge() ? 1 : 0));

        System.out.println(
                people.stream().filter( p->p.getAge()<18 ).count()
        );


        //list of all adult names in uppercase
        List<String> badnames = new ArrayList<>(  );
        people.stream()
                .filter(person->person.getAge()>18).map( person -> person.getName().toUpperCase() ).forEach( na->badnames.add( na ) );
        System.out.println(badnames);

        System.out.println(people.stream()
                .filter( person -> person.getAge()>18 )
                .map( person -> person.getName().toUpperCase() )
                .collect(Collectors.toList()));


        //get list of all males distinct names
        Set<String> malesNames =
                people.stream()
                        .filter( person -> person.getGender() == Gender.MALE ).map( person -> person.getName()).collect( Collectors.toSet());
        System.out.println(malesNames);


        //map with stream
        Map<String, Person> map =
                people.stream().collect(
                        Collectors.toMap(  person -> person.getName() + ":" + person.getAge(), person -> person) );

        System.out.println(map);

        //groupBy using Streams
        Map<String, List<Person>> mapWithList =
                people.stream()
                .collect( Collectors.groupingBy( Person::getName ) );

        mapWithList.forEach( (k,v) -> System.out.println(k + "--" + v));

        //find the first person whose name is 4 letters but older than 25
        System.out.println("the first person whose name is 4 letters but older than 25 ::");
        System.out.println(people.stream().filter( Streams::is4Letters ).filter( person -> person.getAge()>25 ).findFirst());

        //infinite collection
        Stream.iterate(1, e->e+1)
                .filter( e -> e%2==0 )
                .limit( 10 ).forEach( System.out::println);

    }


    public static boolean is4Letters(Person person){
        System.out.println("Called for person :: " + person);
        return  (person.getName().length()==4);
    }


    private static List<Person> createPeople(){
        return Arrays.asList(
                new Person( "Sara", 20, Gender.FEMALE ),
                new Person( "Sara", 22, Gender.FEMALE ),
                new Person( "Bob", 20, Gender.MALE ),
                new Person( "Pavlo", 32, Gender.MALE ),
                new Person( "Paul", 32, Gender.MALE ),
                new Person( "Jack", 2, Gender.MALE ),
                new Person( "Jack", 72, Gender.MALE ),
                new Person( "Jill", 12, Gender.FEMALE )
        );
    }

}
