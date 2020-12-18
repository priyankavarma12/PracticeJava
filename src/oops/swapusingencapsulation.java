package oops;

public class swapusingencapsulation {

    private static void swap(Person one, Person two){
        Person temp = one;
        one = two;
        two = temp;
    }

    private static void swap2(Person one, Person two){
        int tage = one.age;
        one.age = two.age;
        two.age = tage;

        String tname = one.name;
        one.name = two.name;
        two.name = tname;
    }

    private static void swap3(Person one, Person two){
        one = new Person();
        int tage = one.age;
        one.age = two.age;
        two.age = tage;

        two = new Person();
        String tname = one.name;
        one.name = two.name;
        two.name = tname;
    }

    private static void swap4(Person one, Person two){
        int tage = one.age;
        one.age = two.age;
        two.age = tage;

        two = new Person();
        String tname = one.name;
        one.name = two.name;
        two.name = tname;

        one = new Person();
    }

    public static void main(String[] args) {
        Person p1, p2;

        p1 = new Person();
        p1.age = 10;
        p1.name = "A";

        p2 = new Person();
        p2.age = 20;
        p2.name = "B";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
        //swap( p1, p2 );
       // swap2( p1, p2 );
        // swap3(p1, p2);
        swap4( p1, p2 );
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }


}
