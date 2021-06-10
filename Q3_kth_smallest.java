import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author: Aman
 * @Date 10/06/2021
 */
public class Q3_kth_smallest {
    public static void main(String[] args) {
        int[] arr = {7,10, 4 ,3, 20, 15};
        int k =3;
        PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            heap.add(j);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        System.out.println(heap.peek());
    }
}
