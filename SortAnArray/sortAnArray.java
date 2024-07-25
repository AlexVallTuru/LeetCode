public class sortAnArray {

    public static void main(String[] args) {

        int[] solution = sortArray(new int[] { 5, 1, 1, 2, 0, 0 });

    }

    public static int[] sortArray(int[] nums) {

        /*ORDENACION BUBBLE SORT O(n2)

        int tempPos = 0;
        boolean aux = true;

        //Comparamos si el de la izquierda es mayor que el de la derecha cambiamos la poscion.
        while(aux){
            aux = false;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i -1]){
                    tempPos = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = tempPos;
                    aux = true;
                }
            }
            if(aux == false){
                break;
            }
        }
        return nums;
    }*/

}