//package SortTheJumbledNumbers;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTheJumbledNumbers {

    /*
     * Input: mapping = [8,9,4,0,2,1,3,5,7,6], nums = [991,338,38]
     * Output: [338,38,991]
    
     * Input: mapping = [0,1,2,3,4,5,6,7,8,9], nums = [789,456,123]
     * Output: [123,456,789]

     */

    public static void main(String[] args) {
        
        int[] resolution = sortJumbled(new int[]{0,1,2,3,4,5,6,7,8,9},new int[]{789,456,123});

    }

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        
        ArrayList<MappingJumble> mappingJunleList = new ArrayList<>();
        

        for(int num:nums){

            int mapped = num;
            int jumbled = 0;
            
            char[] signleNums = Integer.toString(mapped).toCharArray();
            ArrayList<String> numCompuesto = new ArrayList<>();

            for(int i = 0; i < signleNums.length; i++){
                int numeroCharSingle = Character.getNumericValue(signleNums[i]);
                String numeroSingleString = Integer.toString(mapping[numeroCharSingle]);
                numCompuesto.add(numeroSingleString);
            }
            String numCompouest = "";
            for(String stringNum: numCompuesto){
                numCompouest = numCompouest + stringNum;
            }
            
            MappingJumble mappingJumble = new MappingJumble(mapped, Integer.parseInt(numCompouest));
            mappingJunleList.add(mappingJumble);
        }

        mappingJunleList.sort(Comparator.comparing(MappingJumble::getJumbled));
        int [] result = new int[mappingJunleList.size()];
        int count = 0;
        for(MappingJumble mappingJumble:mappingJunleList ){
            System.out.println(mappingJumble.getMapped() + " " + mappingJumble.getJumbled());
            result[count++] = mappingJumble.getMapped();
        }
        return result;
    }

    public static class MappingJumble{
        
        int mapped;
        int jumbled;

        public MappingJumble(int mapped, int jumbled) {
            this.mapped = mapped;
            this.jumbled = jumbled;
        }

        public int getMapped() {
            return mapped;
        }

        public void setMapped(int mapped) {
            this.mapped = mapped;
        }

        public int getJumbled() {
            return jumbled;
        }

        public void setJumbled(int jumbled) {
            this.jumbled = jumbled;
        }
    }
}
