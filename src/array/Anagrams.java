package array;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char [] ca = a.toLowerCase().toCharArray();
        char [] cb = b.toLowerCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca,cb);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    //IsPalindrome using Lambda
    public static PerformOperation isPalindrome(){
        return (int a) -> Integer.toString( a ).equals( new StringBuilder(Integer.toString( a )).reverse().toString() );
    }

    //Even Odd using Lambda
    public static PerformOperation isOdd(){
        return (int a) -> a % 2!=0;
    }

    //Is Prime using Lambda
    public static PerformOperation isPrime(){
       return (int a) -> BigInteger.valueOf( a ).isProbablePrime( 1 );
    }
}

interface PerformOperation{
    boolean check (int a);
}
