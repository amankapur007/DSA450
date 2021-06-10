import java.util.Arrays;

/**
 Given an array (or string), the task is to reverse the array/string.
 Examples :


 Input  : arr[] = {1, 2, 3}
 Output : arr[] = {3, 2, 1}

 Input :  arr[] = {4, 5, 1, 2}
 Output : arr[] = {2, 1, 5, 4}

 @Author: Aman
 @Date - 10-06-2021
 */
public class Q1_Reverse{
    public static void main(String[] args){
        //int[] arr = {1, 2, 3};
        int[] arr = {4, 5, 1, 2};
        for(int i =0;i*2<arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}