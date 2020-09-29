package array;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        System.out.print("1D Array ::");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
         System.out.println();
         //runningSum( arr );
        sumOfArray(arr);

    }

    public static int[] runningSum(int[] nums){
        System.out.println("Running sum of 1D Array :: ");
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
            System.out.print( " "+nums[i] );
        }
        return nums;
    }

    public static int[] sumOfArray(int[] nums){
       int sum = 0;
       for(int i=0;i<nums.length;i++){
           nums[i] =  sum + nums[i];
            sum = nums[i];
           System.out.print(" "+sum);
       }
        return nums;
    }
}
