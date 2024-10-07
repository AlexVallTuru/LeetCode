package MinimumStringLength;

public class minimumStringLength {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        minLength("ABFCACDB");
    }

    public static int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")){
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        }

        return s.length();
    }

}
