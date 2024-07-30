package RotateArray;

import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args) {

        rotate(new int[] { 1, 2, 3, 4, 5 }, 3);

    }

    public static void rotate(int[] nums, int k) {

        //SOLUCION NO CORRECTA POR EL TIMEMPO DE EJECUCION 
        
        /*
         * int len = nums.length;
         * k = k % len;
         * int temp;
         * 
         * if (k == 0) return;
         * for (int i = len -1; i > 0; i--) {
         * if (i > len - k -1) {
         * temp = nums[len -1];
         * for (int j = len -1; j > 0; j--) {
         * nums[j] = nums[j - 1];
         * }
         * nums[0] = temp;
         * }
         * 
         * }
         */

        int len = nums.length;
        k = k % len;
        if(k == 0){
            return;
        }

        //SOLUCION DE CHAT GPT

        reverse(nums, 0, len -1); //rotar el array
        reverse(nums, 0, k -1); // rotar los numero a invetir al inicio
        reverse(nums, k, len -1);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void reverse(int[] nums, int start, int end){

        while (start < end) {
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

}
