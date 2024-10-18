//package ReverseString;

public class reverseString {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public void reverseStrings(char[] s) {

        reversed(s, s.length - 1, 0);

    }

    public void reversed(char[] s, int indexRight, int indexLeft) {

        if (indexLeft >= indexRight) {
            return;
        }

        char temp = s[indexRight];
        s[indexRight] = s[indexLeft];
        s[indexLeft] = temp;

        reversed(s, indexRight - 1, indexLeft + 1);
    }

}
