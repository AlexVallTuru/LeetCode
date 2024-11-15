package FindGoodPairs;

public class findTheGoodPairs {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        findTheGoodPairs n = new findTheGoodPairs();
        n.numberOfPairs(new int[] { 1, 2, 4, 12 }, new int[] { 1, 4 }, 3);
    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
