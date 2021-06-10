/**
 * Maximum and minimum of an array using minimum number of comparisons
 * @Author: Aman
 * @Date: 10-06-2021
 */

public class Q2_max_min {
    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        int max = Integer.MIN_VALUE;
        int min =  Integer.MAX_VALUE;
        if(arr.length==1){
            max= arr[0];
            min= arr[0];
        }

        if(arr.length==2){
            max= Math.max(arr[0], arr[1]);
            min= Math.min(arr[0], arr[1]);
        }

        for(int i =2 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }
        }

        System.out.println("Min - "+min+" ,Max - "+max);
    }
}
