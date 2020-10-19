package general;

import java.util.Scanner;

public class IsPrimeOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();

        for(int i =0;i<t;i++){
            int num = scanner.nextInt();

            int count = 0;
            for(int div = 2; div * div <= num; div++){
               if(num % div == 0){
                   count ++;
                   break;
               }
            }
            if(count == 0){
                System.out.println("prime");
            } else{
                System.out.println("not prime");
            }
        }
    }
}
