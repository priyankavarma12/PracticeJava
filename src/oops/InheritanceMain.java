package oops;

public class InheritanceMain {

    public static void main(String[] args) {

      /*  Child c = new Child();
      //  System.out.println(c.d1); //Compile time errors
        System.out.println(c.d);
        System.out.println(c.d2);
      //  c.fun1(); // Compile time errors
        c.fun();
        c.fun2();*/
        System.out.println("Object o1 :: ");
        Parent o1 = new Parent();
        o1.fun1();
        o1.fun();
       // o1.fun2(); // Compile time error
        System.out.println(o1.d);
        System.out.println(o1.d1);
      //  System.out.println(o1.d2); // Compile time error

        System.out.println("Object o2 :: ");
        Parent o2 = new Child();
        o2.fun();
        o2.fun1();
       // o2.fun2(); // compile time error
        System.out.println(o2.d);
      //  System.out.println(o2.d2); // Compile time error
        System.out.println(o2.d1);


    }
}



/**
Object o1 ::
Parent Func1
Parent Fun
100
10
Object o2 ::
Child Fun
Parent Func1
100
10

 */