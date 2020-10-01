package array;

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
}
