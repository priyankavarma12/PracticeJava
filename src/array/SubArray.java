package array;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int n = scn.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = arr[j] + sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}

/**
 * Print the number of subarrays of  having negative sums.
 * Input n = 5
 * 1 -2 4 -5 1
 * Output = 9
 *
 * Explanation
 * There are nine negative subarrays of A = [1,-2,4,-5,1]
 * 1 . [1:1] => 2
 * 2 . [3:3] => 5
 * 3 . [0:1] => 1+(-2) = 1
 * 4 . [2:3] => 4+(-5) = 1
 * 5 . [3:4] => (-5)+1 = 4
 * 6 . [1:3] => (-2)+4+(-5) = 3
 * 7 . [0:3] => 1+(-2)+4+(-5) = 2
 * 8 . [1:4] => (-2)+4+(-5)+1 = 2
 * 9 . [0:4] => 1+(-2)+4+(-5)+1 = 1
 * Thus we print 9 in new line
 */