public class scoreofaString {
    
    public static void main(String[] args) {
        
        System.out.println(scoreOfString("hello"));

        
    }

    public static int scoreOfString(String s) {
        
        char[] asiiChar = s.toCharArray();

        int result = (int) asiiChar[0];
        int temp = 0;

        for(int i = 1; i <= asiiChar.length -1; i++){
            temp = temp + Math.abs(result - (int) asiiChar[i]);
            result = (int) asiiChar[i];
        }

        return temp;
    }

}
