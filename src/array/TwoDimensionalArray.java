package array;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}

/** 2D Array
Input
n = 2
m = 4
11
12
13
14
21
22
23
24
Output
11 12 13 14
21 22 23 24



 */