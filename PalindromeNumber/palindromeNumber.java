public class palindromeNumber {

    public static void main(String[] args) {

        boolean result = isPalindrome(121);

        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {
        String numString = String.valueOf(x);
        String reverString = new StringBuilder(numString).reverse().toString();
        return (reverString.equals(numString));
    }

}