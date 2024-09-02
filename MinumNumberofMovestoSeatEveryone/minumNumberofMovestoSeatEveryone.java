//package MinumNumberofMovestoSeatEveryone;

import java.util.Arrays;

public class minumNumberofMovestoSeatEveryone {
    public static void main(String[] args) {

//        System.out.println("Hello LeetCoder!!");

        System.out.println(minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}));

    }

    public static int minMovesToSeat(int[] seats, int[] students) {

        if(seats.length == 0 || students.length == 0){
            return 0;
        }
        //Utiliza chuicksort
        Arrays.sort(seats);
        Arrays.sort(students);

        int result = 0;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] >= students[i]) {
                result += seats[i] - students[i];
            } else {
                result += students[i] - seats[i];
            }

        }
        return result;
    }

}
