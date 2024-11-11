public class jewelsAndStones {
    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");
        jewelsAndStones j = new jewelsAndStones();
        j.numJewelsInStones("aA", "aAAbbbb");
    }

    public int numJewelsInStones(String jewels, String stones) {

        char[] allJewels = jewels.toCharArray();
        int len = jewels.length();
        int result = 0;

        for (int i = 0; i < len; i++) {
            String jewel = Character.toString(allJewels[i]);
            while (stones.contains(jewel)) {
                stones = stones.replaceFirst(jewel, "");
                result++;
            }
        }
        return result;
    }
}