package functions;

import java.util.Scanner;

public class DigitsFrequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    private static int getDigitFrequency(int n, int d) {
        int retValue = 0;
        while(n > 0){
            int dig = n % 10;
            n = n/10;

            if( dig == d){
                retValue++;
            }
        }
        return  retValue;
    }

}

/**
 * Digits Frequency
 * Input n = 994543234
 * Input d = 4
 * Output = 3
 */