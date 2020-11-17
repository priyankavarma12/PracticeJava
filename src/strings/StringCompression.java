package strings;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String s = scanner.next();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
    }

    //compress string with duplicate characters
    private static String compression1(String s) {
        String str = s.substring( 0,1 );
        for(int i = 1; i < s.length(); i++){
          char current = s.charAt( i );
          char previous = s.charAt( i - 1 );
          if(current != previous){
              str += current;
          }
        }
        return str;
    }

    //count the character along with compress the duplicate
    private static String compression2(String s) {
        String str = s.substring( 0,1 );
        int count = 1;
        for(int i=1; i < s.length(); i++) {
            char current = s.charAt( i );
            char previous = s.charAt( i - 1 );
            if (current == previous) {
                count++;
            } else {
                if (count > 1) {
                    str += count;
                    count = 1;
                }
                str += current;
            }
        }
        if(count > 1){
            str += count;
            count = 1;
        }
        return str;
    }
}

/**
Input
aaaabbbccd
Output
abcd
a4b3c2d
 */