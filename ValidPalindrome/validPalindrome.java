public class validPalindrome{

    public static void main(String[] args) {
        
        boolean result = isPalindrome("0P");
        System.out.println(result);

    }

    public static boolean isPalindrome(String s) {
        
        char[] frase = s.toCharArray();
        StringBuilder fraseLimpia = new StringBuilder();

        for(char c:frase){
            if(Character.isLetterOrDigit(c)){
                fraseLimpia.append(c);
            }
        }

        return (fraseLimpia.toString().toLowerCase().equals(fraseLimpia.reverse().toString().toLowerCase()));

    }

}