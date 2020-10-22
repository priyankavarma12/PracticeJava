package general;

import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {
        System.out.println("Digits Of Number");
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int nod = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            nod ++;
        }

        int div = (int) Math.pow( 10, nod -1 );
        while(div !=0){
            int q = n/div;
            System.out.println(q);

            n = n % div;
            div = div/10;
        }
        System.out.println("Reverse of Number:");
        reverseNumber( 654 );
        System.out.println("Inverse of Number :");
        inverseNumber( 21453 );
    }

//Reverse Number
// Input - 754
// Output - 457
    private static int reverseNumber(int n){
        int dig = 0;
        while(n>0){
            dig = n % 10;
            System.out.println(dig);
            n = n/10;
        }
        return dig;
    }


    //Inverse of Number
/*
Input - 21453
Output - 23154
 */
    private static int inverseNumber(int n){
        int inv = 0;
        int originalPos = 1;
        while(n!=0){
            int  originalDig = n%10;
            int inversePos = originalDig;
            int inverseDig = originalPos;

            inv = inv + inverseDig * (int)Math.pow( 10, inversePos -1  );
            n = n/10;
            originalPos ++;
        }
        return inv;
    }
}

// Digits Of Number
// Input - 654321
// Output
/* 6
5
4
3
2
1
 */


