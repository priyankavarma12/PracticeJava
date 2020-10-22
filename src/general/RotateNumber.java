package general;

import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp = temp/10;
            nod++;
        }

        k = k % nod;
        if(k < 0){
            k = k + nod;
        }
        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++){
            if( i <= k){
                div = div * 10;
            } else{
                mult = mult * 10;
            }
        }

        int q = n / div;
        int r = n % div;
        int rot = r * mult + q;
        System.out.println(rot);
    }
}

/*
Input n = 562984
k = 2
output = 845629
 */
