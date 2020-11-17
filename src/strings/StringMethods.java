package strings;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String s1 = "hello";
        // next() prints the character only a word and one space
       // String s2 = scanner.next();
        //nextLine prints the complete sentences
       // String s2 = scanner.nextLine();
        System.out.println(s1);
       // System.out.println(s2);

        //Size of the String
        System.out.println(s1.length());

        //print each character of String
        System.out.println("Print the characters of String");
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt( i );
            System.out.println(ch);
        }

        System.out.println("Print Substring");
        String s = "abcd";
        System.out.println(s.substring( 1,2 ));

        System.out.println("Print all Substrings");
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring( i,j ));
            }
        }

        System.out.println("Concat a string");
        //String concat from Left to Right
        //System.out.println("hello"+10+20);
        System.out.println(10+20+" "+"hello");

        System.out.println("Split method in String");
        String sp = "abcd,efgh,ijkl";
        String[] parts = sp.split(",");
        for(int i=0;i<parts.length; i++){
            System.out.println(parts[i]);
        }

    }
}
