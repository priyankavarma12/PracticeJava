package general;

import java.util.Scanner;

public class GcdAndLcm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int on1 = n1;
        int on2 = n2;
        while( n1 % n2 != 0){
            int rem = n1 % n2;
            n2 = rem;
            n1 = n2;
        }
        int gcd = n2;
        System.out.println(gcd);

        int lcm = (on1 * on2) / gcd;
        System.out.println(lcm);
    }
}
/*
Input - n1 = 9983
n2 = 1192
Output
gcd = 447
lcm = 26621

Input - n1 = 36
n2 = 24
output
gcd = 12
lcm = 72
 */

