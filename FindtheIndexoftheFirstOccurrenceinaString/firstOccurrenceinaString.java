//package FindtheIndexoftheFirstOccurrenceinaString;

public class firstOccurrenceinaString {
    
    public static void main(String[] args){

    int result = strStr("patata", "tata");
        System.out.println(result);

    }

    public static int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        } else{
            return -1;
        }
    }

}
