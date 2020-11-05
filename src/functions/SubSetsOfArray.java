package functions;

import java.util.Scanner;

public class SubSetsOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        int limit = (int) Math.pow( 2, a.length );
        for(int i=0;i<limit;i++){
            int temp = i;
            String set = "";
            for(int j=a.length-1;j>=0;j--){
                int r = temp % 2;
                temp = temp/2;
                if(r==0){
                    set = "-\t" + set;
                } else {
                    set = a[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}

/**
Input
n = 3
10
20
30
Output
-	-	-
-	-	30
-	20	-
-	20	30
10	-	-
10	-	30
10	20	-
10	20	30
 */