package MaximumSwap;

public class maximumSwap {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        maximumSwap m = new maximumSwap();
        m.maximumSwapp(9937);

    }

    public int maximumSwapp(int num) {

        //int to int[]
        int len = (int) Math.log10(num) + 1;
        int[] digits = new int[len]; 
        int index = len -1;
        while (num > 0) {
            digits[index--] = num % 10; 
            num /= 10; 
        }

        int maxNum = -1;
        int swapMax = -1;
        int swapMin = -1;

        for (int i = len -1; i >= 0; i--) {
        
            if(maxNum == -1 || digits[maxNum] < digits[i]) {
                maxNum = i;
            } else if(digits[maxNum] > digits[i]) {
                swapMax = maxNum;
                swapMin = i;
            }            
        }
        
        if(swapMax != -1 && swapMin != -1){
            int temp = digits[swapMax];
            digits[swapMax] = digits[swapMin];
            digits[swapMin] = temp;
        }

        int result = 0;
        for (int i = 0; i < len; i++) {
            result = result * 10 + digits[i];
        }

        return result;

    }

}
