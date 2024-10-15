package SeparateBlackandWhiteBalls;

public class separateBlackandWhiteBalls {

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        separateBlackandWhiteBalls s = new separateBlackandWhiteBalls();

        s.minimumSteps("010011010");

    }

    public long minimumSteps(String s) {
        
        char[] arrBalls = s.toCharArray();
        int len = arrBalls.length;

        long countZeros = 0;
        long countIter = 0;
        
        for (int i = len -1; i >= 0; i--) {
        
            if(arrBalls[i] == '0'){
                countZeros += 1;
            } else {
                countIter += countZeros;
            }
        }

        return countIter;
    }

}