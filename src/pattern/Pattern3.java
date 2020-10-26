package pattern;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int sp = n-1;
        int st = 1;
        for(int i=1; i <= n; i++){
           for(int j=1;j <= sp;j++){
               System.out.print("\t");
           }
           for(int j =1;j <= st;j++){
               System.out.print("*\t");
           }
            //System.out.println(sp+ ", "+ st);
           sp--;
           st++;
           System.out.println();
        }
    }
}

/**
Pattern3
                *
			*	*
		*	*	*
	*	*	*	*
*	*	*	*	*

 */
