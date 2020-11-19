package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();

        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add( scanner.nextInt() );
        }

        solution(al);
        System.out.println(al);
    }

    private static void solution(ArrayList<Integer> al) {
        for(int i=al.size()-1;i>=0;i--){
            int val = al.get( i );
            if(isPrime(val) == true){
                al.remove( i );
            }
        }

    }

    private static boolean isPrime(int val) {
        for(int div=2;div*div<=val;div++){
            if(val%div==0){
                return false;
            }
        }
        return true;
    }


}

/** Remove Prime numbers
Input
n = 4
al = 3 12 13 15
Output
[12, 15]
 */