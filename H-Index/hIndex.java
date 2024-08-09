import java.util.Arrays;
import java.util.Collections;

public class hIndex {

    public static void main(String[] arg) {

        int result = zIndex(new int[] { 11,15 });
        System.out.println(result);
    }

    public static int zIndex(int[] citations) {

        // Integer[] citationsInteger = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        // Arrays.sort(citationsInteger, Collections.reverseOrder());

        Arrays.sort(citations);
        reverseArray(citations);

        if (citations.length == 0 || citations[0] == 0) {
            return 0;
        }
        if (citations.length == 1) {
            return 1;
        }



        int result = -1;

        for(int i = 0; i < citations.length; i++){

            if (citations[i] >= i+1) {
                
                result = i+1;

            } else {
                break;
            }

        }

        return result;

    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
