import java.util.Arrays;

public class minAvarageSmallerandElements {

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
    }

    public static double minimumAverage(int[] nums) {

        int len = nums.length;
        Double[] arrAvarage = new Double[len/2];
        Arrays.sort(nums);

        for (int i = 0; i < len / 2; i++) {
            int minNum = nums[i];
            int maxNum = nums[len - i -1];
            arrAvarage[i] = (double) ((minNum + maxNum) / 2.0);
        }
        Arrays.sort(arrAvarage);
        return arrAvarage[0];
    }
}