package functions;

import java.util.Scanner;

public class DecimalToBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        int rv = 0;
        int pow = 1; //(10 pow 0 = 1)
        while(n > 0){
            int dig = n % b;
            n = n / b;

            rv = rv + dig * pow;
            pow = pow * 10;
        }
        return rv;
    }
}

/**
Input
57
 2
Output
111001
 */