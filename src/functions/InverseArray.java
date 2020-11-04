package functions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InverseArray {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        int n = Integer.parseInt( br.readLine() );
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt( br.readLine() );
        }
        int[] inv = inverse(a);
        display(inv);

    }

    private static void display(int[] a) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Inverse Array");
        for(int val : a){
            sb.append( val + "\n" );
        }
        System.out.println(sb);
    }
    //Value becomes index and index becomes value
    private static int[] inverse(int[] a) {
        int[] inv = new int[a.length];
        for(int i=0;i<a.length;i++){
            int val = a[i];
            inv[val] = i;
        }
        return  inv;
    }

}


/**
Input
n = 5
4
0
2
3
1
Inverse Array
1
4
2
3
0

 */
