package KidsCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsCandies {

    public static void main(String[] args) {

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = Arrays.stream(candies).max().getAsInt();

        for (int candie : candies) {
            if (candie + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

}
