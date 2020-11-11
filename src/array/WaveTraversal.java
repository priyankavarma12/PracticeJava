package array;

import java.util.Scanner;

public class WaveTraversal {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }

        for(int j=0;j<a[0].length;j++){
            if(j%2==0){
                for(int i=0;i<a.length;i++){
                    System.out.println(a[i][j]);
                }
            } else {
                for(int i=a.length-1;i>=0;i--){
                    System.out.println(a[i][j]);
                }
            }
        }

    }
}

/**
Input
n=3
m=4
11
12
13
14
21
22
23
24
31
32
33
34
Output
11
21
31
32
22
12
13
23
33
34
24
14
 */