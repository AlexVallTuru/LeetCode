import java.util.Collections;
import java.util.PriorityQueue;

public class maxScoreAfterK {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        maxScoreAfterK m = new maxScoreAfterK();

        m.maxKelements(new int[] {1,10,3,3,3}, 3);
    }

    public long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {

            maxHeap.add(num);

        }

        long result = maxHeap.peek();
        long temp = 0;

        for (int i = 0; i < k -1; i++) {
            temp = (long) Math.ceil(((double) maxHeap.poll()) / 3);
            maxHeap.add((int)temp);
            result += maxHeap.peek();
        }

        return result;

    }

}