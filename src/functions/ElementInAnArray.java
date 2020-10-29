package functions;

import java.util.Scanner;

public class ElementInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        int d = scanner.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == d ){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}

/**
Input
6
15
30
40
4
11
9
40

Output
2
 */