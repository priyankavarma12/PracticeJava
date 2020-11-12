package array;

import java.util.Scanner;

public class DiagonalTraversal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int g=0;g<arr.length;g++){
            for(int i=0,j=g;j<arr.length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

/**
Input 2*2 matrix
2
11 12
21 22
Output - Diagonal of Matrix
11
22
12
 */