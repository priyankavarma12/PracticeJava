package array;

import java.util.Scanner;

public class ArrayTwoD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int sum;

        hourglass( arr);
    }

    private static int hourglass(int[][] arr) {
        int sum;
        int max = 0;
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                sum = arr[i + 1][j + 1];
                for(int k = j; k < j + 3; k++){
                    sum += arr[i][k] + arr[i + 2][k];
                }
                if(sum > max)
                    max = sum;
            }
        }

        System.out.print( max );
        return max;
    }

}
