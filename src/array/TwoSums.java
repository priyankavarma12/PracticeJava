package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        System.out.println("Input :: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        //twoSumsBruteForce( arr, target );
        twoSums( arr, target );

    }

    public static int[] twoSums(int[] num, int target ) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++) {
           map.put(num[i], i);
        }
        for(int i=0;i<num.length;i++) {
            int diff = target - num[i];
            if(map.containsKey( diff ) && map.get( diff )!=i){
                System.out.println("Result :: "+"[" +i +","+map.get( diff ) +"]");
                return new int[]{ i, map.get( diff )};
            }
        }
        throw new IllegalArgumentException("No two sum solution ");
    }

    public static int[] twoSumsBruteForce(int num[], int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1; j<num.length;j++){
                if(num[i]+num[j] == target){
                    System.out.println("Result :: "+ "(" +i+ ","+ j + ")");
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }


}
