package array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtracor {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int testcases = Integer.parseInt( sc.nextLine() );
        while(testcases>0){
            String line = sc.nextLine();
            boolean found = false;
            Pattern regex = Pattern.compile( "<(.+)>([^<]+)</\\1>" );
            Matcher match = regex.matcher( line );

            while(match.find()){
                System.out.println(match.group(2));
                found = true;
            }
            if(!found){
                System.out.println("None");
            }
            testcases--;
        }

    }
}
