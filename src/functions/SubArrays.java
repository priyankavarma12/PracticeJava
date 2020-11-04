package functions;

import java.util.Scanner;

public class SubArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k] + "\t");
                }
                System.out.println();
            }
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
10
10	20
10	20	30
20
20	30
30
 */