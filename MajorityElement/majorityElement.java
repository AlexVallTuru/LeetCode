//package MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public static void main(String[] args) {

        int result = majorityElement1(new int[] { 3, 2, 3 });
        System.out.println(result);
    }

    public static int majorityElement1(int[] nums) {

        Map<Integer, Integer> mapNumerosRepetidos = new HashMap<>();

        for(int num:nums){

            if(mapNumerosRepetidos.containsKey(num)){
                mapNumerosRepetidos.put(num, mapNumerosRepetidos.get(num) +1);
            } else {
                mapNumerosRepetidos.put(num, 1);
            }
        }

        int maxReps = -1;
        int numMasRepetido = -1;

        for(Map.Entry<Integer, Integer> entry : mapNumerosRepetidos.entrySet()){

            if(entry.getValue() > maxReps) {
                maxReps = entry.getValue();
                numMasRepetido = entry.getKey();
            }
        }
        return numMasRepetido;
    }
}