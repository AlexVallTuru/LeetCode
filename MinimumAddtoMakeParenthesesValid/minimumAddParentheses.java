public class minimumAddParentheses {
    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        minimumAddParentheses m = new minimumAddParentheses();

        m.minAddToMakeValid("()))((");

    }

    public int minAddToMakeValid(String s) {
        
        int len = s.length();

        int open = 0;
        int result = 0;

        for (int i = 0; i < len; i++) {
        
            if(s.charAt(i) == '('){

                open++;

            } else if(open > 0){
                open--;
            } else {
                result++;
            }
        
        }

        if (open > 0) {
            result = open + result;
        }


        return result;
    }
}