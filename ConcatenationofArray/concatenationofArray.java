package ConcatenationofArray;

public class concatenationofArray {

    public static void main(String[] args) {

        System.out.println("Hello LeetCode");

    }

    public int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] result = new int[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i >= len / 2) {
                result[i] = nums[count];
                count++;
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}