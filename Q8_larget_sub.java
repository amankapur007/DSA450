/**
 * @Author: Aman
 * @Date: 11/06/2021
 */
public class Q8_larget_sub {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int curr_sum = arr[0];
        int max_sum = arr[0];
        for(int i=1;i<arr.length;i++){
            curr_sum = Math.max(curr_sum+arr[i], arr[i]);
            max_sum = Math.max(curr_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
