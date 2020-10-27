package pattern;

import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.println(n + " * " +i + " = " +n*i + "\t");
        }
        System.out.println("\t");

    }
}

/**
Pattern14
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
 */