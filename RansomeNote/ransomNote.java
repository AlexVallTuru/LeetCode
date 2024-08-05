import java.util.HashMap;
import java.util.Map;

public class ransomNote{

    public static void main(String[] args) {

        boolean result = canConstruct("aac", "aab");
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        

        Map<Character, Integer> ransomNoteCotnador = new HashMap();
        Map<Character, Integer> ransmagazineContador = new HashMap();

        char[] ransomNoteChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();

        if(ransomNoteChar.length > magazineChar.length){
            return false;
        }

        for(char c: ransomNoteChar ){
            if (ransomNoteCotnador.containsKey(c)) {
                ransomNoteCotnador.put(c, ransomNoteCotnador.get(c) +1);
            } else {
                ransomNoteCotnador.put(c, 1);
            }
        }
        
        for(char c: magazineChar ){
            if (ransmagazineContador.containsKey(c)) {
                ransmagazineContador.put(c, ransmagazineContador.get(c) +1);
            } else {
                ransmagazineContador.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: ransomNoteCotnador.entrySet() ){
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if(ransmagazineContador.containsKey(key)){
                if(ransmagazineContador.get(key) < value){
                    return false;
                }
            }else{
                return false;
            }

        }

        return true;

    }

}