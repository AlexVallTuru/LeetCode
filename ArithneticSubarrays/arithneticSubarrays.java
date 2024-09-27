import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arithneticSubarrays {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> listResult = new ArrayList<>();

        int len = l.length;

        for (int i = 0; i < len; i++) {

            int[] subArray = new int[r[i] - l[i] + 1];
            int count = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                subArray[count] = nums[j];
                count++;
            }

            Arrays.sort(subArray);

            int lenSubArray = subArray.length;

            if (lenSubArray >= 2) {

                boolean isArithmetic = true;
                int diff = subArray[1] - subArray[0];

                for (int k = 2; k < lenSubArray; k++) {

                    if (subArray[k] - subArray[k - 1] != diff) {
                        isArithmetic = false;
                        break;
                    }
                }
                listResult.add(isArithmetic);

            } else {
                // Si la longitud de la subarray es menor que 2, no puede ser aritmética
                listResult.add(false);
            }
        }

        return listResult;
    }

}
