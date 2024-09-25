
//package SortingtheSentence;
import java.util.HashMap;
import java.util.Map;

public class sortingtheSentence {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");
        sortSentence("is2 sentence4 This1 a3");
    }

    public static String sortSentence(String s) {

        String[] splitString = s.split(" ");
        int len = splitString.length;
        int[] numerosPos = new int[len];

        for (int i = 0; i < len; i++) {
            for (char c : splitString[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    numerosPos[i] = Integer.parseInt(Character.toString(c));
                }
            }
        }

        return "";
    }
}

public class posStrings()
{

    private String content = new String();
    private int pos;

    public posStrings(String content, int pos) {
            this.content = content;
            this.pos = pos;
        }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

}
