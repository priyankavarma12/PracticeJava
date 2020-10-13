package array;

import java.util.Scanner;

public class TwoArraySum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        System.out.println(maxHourGlass(arr));
    }

    private static int maxHourGlass(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int sum = findSum(arr, i, j);
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    private static int findSum(int [][] arr, int r, int c){
        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
                + arr[r+1][c+1] +
                arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
        return sum;
    }


}
