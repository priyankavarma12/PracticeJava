package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArray {

    public static void main(String[] args) {
        int arr [] = new int [] {5,4,3,2,1};
        System.out.println("Before Rotation ::" + Arrays.toString(arr));
        System.out.println("After Rotation :: " );
        rotate(arr, 0, arr.length-1);
        System.out.println(Arrays.toString( arr ));
    }

    private static void rotate(int num[], int start, int end ) {
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

}
