import java.util.Arrays;

public class sorttheStudentsbyTheirKthScore{

    public static void main(String[] args) {
    
        System.out.println("Hello LeetCoder!!");
    
        int[][] score = {
            {10, 6, 9, 1},
            {7, 5, 11, 2},
            {4, 8, 3, 15}
        };

        int k = 2; 

        int[][] sortedScore = sortTheStudents(score, k);

    }

    public static int[][] sortTheStudents(int[][] score, int k) {

        Arrays.sort(score, (student1, student2) -> Integer.compare(student2[k], student1[k]));

        return score;
    }
}