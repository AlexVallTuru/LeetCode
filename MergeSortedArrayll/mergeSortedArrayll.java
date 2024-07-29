//package MergeSortedArrayll;

public class mergeSortedArrayll {

    public static void main(String[] args) {

        int result = removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });

    }

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        int contadorRepetidos = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                if (contadorRepetidos < 2) {
                    nums[index] = nums[i];
                    index++;
                }
                contadorRepetidos++;
            } else {
                nums[index] = nums[i];
                contadorRepetidos = 1;
                index++;
            }

        }

        return index;
    }

}
