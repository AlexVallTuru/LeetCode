import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class rankTransformArray {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        arrayRankTransform(new int[] {40,10,20,30});

    }

    public static int[] arrayRankTransform(int[] arr) {

        int[] arrOrdenado = arr.clone();
        Arrays.sort(arrOrdenado);

        int len = arr.length;

        Map<Integer, Integer> numPos = new HashMap<>();

        int count = 0;

        for (int i = 0; i < len; i++) {

            if(i == 0 || arrOrdenado[i] != arrOrdenado[i - 1]){
                count++;
            }

            numPos.put(arrOrdenado[i], count);

        }

        for (int i = 0; i < len; i++) {

            arrOrdenado[i] = numPos.get(arr[i]);

        }

        //Arrays.stream(arrOrdenado).forEach(System.out::println);
        return arrOrdenado;

    }

}