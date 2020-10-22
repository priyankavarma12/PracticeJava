package general;

import java.util.Scanner;

public class PrimeFactorisation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();

        for(int div = 2; div * div <= n; div++){
            while( n % div == 0){
                n = n/div;
                System.out.print(div+ " ");
            }
        }
        if( n != 1){
            System.out.print(n);
        }
    }
}

/*
Input n=1440
Output
2 2 2 2 2 3 3 5
 */
