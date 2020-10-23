package general;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if(b>=max){
            max = b;
        }
        if(c >= max){
            max = c;
        }

        if(max == a){
            boolean flag = ((b*b) + (c*c) == (a*a));
            System.out.println(flag);
        } else if( max == b){
            boolean flag = ((a*a) + (c*c) == (b*b));
            System.out.println(flag);
        } else if(max == c){
            boolean flag = ((b*b) + (a*a) == (c*c));
            System.out.println(flag);
        }

    }

}
