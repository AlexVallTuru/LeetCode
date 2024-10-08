//package MinimumNumberofSwaps;

import java.security.DrbgParameters.Reseed;

public class minimumNumberofSwaps {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        minimumNumberofSwaps m = new minimumNumberofSwaps();
        int result = m.minSwaps("]]][[[");
        System.out.println(result);
    }

    public int minSwaps(String s) {

        int len = s.length();

        int open = 0;
        int result = 0;
        for (int i = 0; i < len; i++) {

            if (s.charAt(i) == '[') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    result++;
                }
            }
        }

        return (result + 1) / 2;

    }

}