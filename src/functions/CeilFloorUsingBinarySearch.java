package functions;

import java.util.Scanner;

public class CeilFloorUsingBinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        int data = scanner.nextInt();

        int low = 0;
        int high = a.length-1;
        int floor = 0;
        int ceil = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(data < a[mid]){
                high = mid - 1;
                ceil = a[mid];
            } else if(data > a[mid]) {
                low = mid + 1;
                floor = a[mid];
            } else {
                ceil = a[mid];
                floor = a[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);

    }
}

/**
Input
n=10
1
5
10
15
22
33
40
42
55
66
data = 34
Output
ceil=40
floor=33
 */