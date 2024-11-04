
public class stringCompressionIII {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public String compressedString(String word) {
     
        StringBuilder result = new StringBuilder();
        int len = word.length();
        int count = 0;
        for (int i = 1; i < len; i++) {
            
            count ++;
            if(word.charAt(i) != word.charAt(i -1)){
                while (count > 9) {
                    result.append(9).append(word.charAt(i-1));
                    count -= 9; 
                }
                if(count > 0) {
                    result.append(count).append(word.charAt(i-1));
                    count = 0;
                }
            }
            
        }
        count ++;
        char lastChar = word.charAt(len - 1);

        // This is not a function because it is competitive programming.
        if(count > 0) {
            
            while (count > 9) {
                result.append(9).append(lastChar);
                count -= 9; 
            }
            if(count > 0) {
                result.append(count).append(lastChar);
                count = 0;
            }
        }
        return result.toString();
}

}