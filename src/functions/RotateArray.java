package functions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateArray {

    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int start, int end ){
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] a, int k){
        // write your code here
        k = k%a.length;
        if(k<0){
            k = k+a.length;
        }
        //Part1 - reverse
        reverse(a, 0, a.length-k-1);
        //Part2 - reverse parts
        reverse(a, a.length-k, a.length-1);
        //Part3 - reverse all
        reverse(a, 0, a.length-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }
}

/**
Input
5
1
2
3
4
5
3
Output
3 4 5 1 2
 */
