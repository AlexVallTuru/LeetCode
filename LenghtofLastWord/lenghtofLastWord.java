
//package LenghtofLastWord;

public class lenghtofLastWord {

    public static void main(String[] args) {

        int result = lengthOfLastWord("luffy is still joyboy");

        System.out.println(result);

    }

    public static int lengthOfLastWord(String s) {

        /**
         * StringBuilder cadena = new StringBuilder(s.trim());
         * 
         * cadena = cadena.reverse();
         * 
         * String[] cad = cadena.toString().split(" ");
         * 
         * return cad[0].length();
         **/

        int len = 0;
        boolean found = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char caracter = s.charAt(i);
            if (caracter != ' ') {
                len++;
                found = true;
            } else if (found) {
                break;
            }
        }
        return len;
    }

}