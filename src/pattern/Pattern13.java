package pattern;

import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int icj = 1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1 = icj * (i-j) / (j+1);
                icj = icjp1;
            }
            System.out.println("\t");
        }

    }
}

/**
Pattern13
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
4c0 4c1 4c2 4c3 4c4
 Uses - nck+1 = nck * (n-k) / k+1

 */
