package array;

import java.util.Scanner;
/*
1
1 2
1 2 3
1 2 3 4
3 2 1
2 1
1
*/
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        System.out.println("Here is your pattern....!!!");

        for(int i=1;i<rows;i++){
            for(int j=1;j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=rows-2;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

/******
   *
  *
 *
******/
        System.out.println("Print Z Pattern ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || i == n-1 || j == n-1-i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
