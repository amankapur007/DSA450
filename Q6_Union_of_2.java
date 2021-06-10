import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Aman
 * @Date: 10/06/2021
 */
public class Q6_Union_of_2 {
    public static void main(String[] args) {
        int n = 5;
        int  k = 3;
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        Set<Integer> s = new HashSet <>();
        for (int j : a) {
            s.add(j);
        }
        for (int j : b) {
            s.add(j);
        }
        System.out.println(s.size());
    }
}
