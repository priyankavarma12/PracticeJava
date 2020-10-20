package general;

import java.util.Scanner;

public class AllNumbersPrimeRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        for(int n = low; n <= high; n++){
            int count = 0;
            for(int div = 2; div * div <= n; div++ ){
                if(n%div == 0){
                    count ++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n);
            }
        }

    }
}
