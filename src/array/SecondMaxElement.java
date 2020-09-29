package array;

public class SecondMaxElement {

    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        secondLargestElement( arr, 4 );
    }

    private static void secondLargestElement(int arr[], int arr_size){
        int first, second;
        first = second = Integer.MIN_VALUE;

        if(arr_size<2){
            System.out.println(" Invalid Input");
            return;
        }

        for(int i=0;i<arr_size;i++) {
            if(arr[i]> first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second && arr[i]!=first){
                second = arr[i];
            }
        }
        if(second ==Integer.MIN_VALUE){
            System.out.println("There is no second largest element in an array");
        } else{
            System.out.println("The second larget element is : " +second);
        }

    }
}
