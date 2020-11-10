package array;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        //r1 and c1 i.e 2 * 3
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int[][] one = new int[r1][c1];
        for(int i=0;i<one.length;i++){
            for(int j=0;j<one[0].length;j++){
                one[i][j] = scanner.nextInt();
            }
        }
        //r2 and c2 i.e 3 * 4
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int[][] two = new int[r2][c2];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j] = scanner.nextInt();
            }
        }

        if(c1 != r2){
            System.out.println("Invalid Input");
            return;
        }
        //for product
        int[][] prd = new int[r1][c2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        //for printing
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/**
Input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
Output
10 0 10 0
0 20 20 40
 */