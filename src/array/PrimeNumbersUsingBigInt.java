package array;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumbersUsingBigInt {

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String n = scanner.nextLine();
            BigInteger val = new BigInteger(n);
            if(val.isProbablePrime(1)){
                System.out.print("prime");
            } else {
                System.out.print("not prime");
            }
            scanner.close();
        }

}
