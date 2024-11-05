package MinimumNumberofChanges;

public class MinNumChanges {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        MinNumChanges min = new MinNumChanges();

        int result = min.minChanges("00010100111000");
    }

    public int minChanges(String s) {

        int len = s.length();
        char[] nums = s.toCharArray();
        int result = 0;

        for (int i = 1; i < len; i += 2) {
            if (nums[i] != nums[i - 1]) {
                result++;
            }
        }
        return result;
    }

}
