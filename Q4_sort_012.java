import java.util.Arrays;

/**
 * @Author: Aman
 * @Date 10/06/2021
 */
public class Q4_sort_012 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int j : arr) {
            if (j == 0) zero++;
            if (j == 1) one++;
            if (j == 2) two++;
        }
        int i = 0;
        while (zero!=0){
            arr[i++]=0;
            zero--;
        }
        while (one!=0){
            arr[i++]=1;
            one--;
        }
        while (two!=0){
            arr[i++]=2;
            two--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
