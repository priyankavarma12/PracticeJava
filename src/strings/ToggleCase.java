package strings;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        String str = scanner.next();
        System.out.println(toggleCase(str));
    }

    private static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt( i );
            if(ch >= 'a' && ch <= 'z'){
                char upper = (char)('A' + ch - 'a');
                sb.setCharAt( i, upper );
            } else if(ch >= 'A' && ch <= 'Z' ){
               char lower = (char)('a' + ch - 'A');
               sb.setCharAt( i, lower );
            }
        }
        return sb.toString();
    }
}


/*
Input
pepCODinG
Output
PEPcodINg
 */
