package functions;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int floor = max; floor>=1; floor--){
           for(int i=0;i<arr.length;i++){
               if(arr[i] >= floor){
                   System.out.print("*\t");
               } else {
                   System.out.print("\t");
               }
           }
            System.out.println();
        }

    }
}

/**
Input
5
3
1
0
7
5
Output
			*
			*
			*	*
			*	*
*			*	*
*			*	*
*	*		*	*
 */
