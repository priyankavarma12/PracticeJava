package strings;

import java.util.Scanner;

public class StringDifferenceConsecutiveChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String str = scanner.next();
        System.out.println(solution(str));

    }

    private static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append( str.charAt( 0 ) );

        for(int i=1;i<str.length();i++){
            char curr = str.charAt( i );
            char prev = str.charAt( i-1 );

            int gap = curr - prev;
            sb.append( gap );
            sb.append( curr );
        }

        return sb.toString();
    }
}
/** difference of ASCII value is the number
Input
pepCODinG
Output
p-11e11p-45C12O-11D37i5n-39G
 */