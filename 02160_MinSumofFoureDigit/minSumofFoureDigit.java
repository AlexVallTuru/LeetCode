import java.util.Arrays;

public class minSumofFoureDigit {

       public static void main(String[] args) {
    
           System.out.println("Hello LeetCoder!!");
    
       }

       public int minimumSum(int num) {
        
        
        char[] numChar = ("" + num).toCharArray();
        int len = numChar.length;
        String[] numSort = new String[len];

        for(int i = 0; i < len; i++){
            numSort[i] = Character.toString(numChar[i]);
        }

        Arrays.sort(numSort);


        //En caso de int[] directo:
        //(digits[0] * 10 + digits[2]) + (digits[1] * 10 + digits[3]);

        return Integer.parseInt(numSort[0] + numSort[2]) + Integer.parseInt(numSort[1] + numSort[3]);

       }

}