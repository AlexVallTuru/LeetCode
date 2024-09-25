import java.util.ArrayList;
import java.util.List;

public class sortingtheSentence {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");
        sortSentence("is2 sentence4 This1 a3");
    }

    public static String sortSentence(String s) {

        String[] splitString = s.split(" ");
        int len = splitString.length;
        List<PosString> listaContentPositions = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            PosString posString = new PosString();
            posString.setContent(splitString[i]);
            for (char c : splitString[i].toCharArray()) {
                if (Character.isDigit(c)) {
                    posString.setPos(Integer.parseInt(Character.toString(c)));
                }
            }
            listaContentPositions.add(posString);
        }

        listaContentPositions.sort((posString1, posString2) -> Integer.compare(posString1.getPos(), posString2.getPos()));
        String result = "";
        for (PosString posString : listaContentPositions) {
            result += posString.getContent() + " ";
        }
        result = result.replaceAll("\\d", "").trim();
        
        System.out.println(result);

        return "";
    }

    public static class PosString {    

        private String content = new String();
        private int pos;

        public PosString(String content, int pos) {
            this.content = content;
            this.pos = pos;
        }

        public PosString() {

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
}
