package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PracticeLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];

        for(int i=0; i < n; i++){
            a[((n- (k%n))+i)%n] = in.nextInt();
        }
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();


    }

    //Using Java 8 Left rotation
    private static int[] rotate(int a[], int d){
        List<Integer> inputs = Arrays.stream(a).boxed()
                .collect( Collectors.toList());

        Collections.reverse(inputs);
        Collections.rotate(inputs, d);
        Collections.reverse(inputs);

        return inputs.stream().mapToInt(x -> x).toArray();
    }

}

/** Using Java 8 and other simple way to left rotate an array
 * Input
 * 5 4
 * 1 2 3 4 5
 * Output
 * 5 1 2 3 4
 */
