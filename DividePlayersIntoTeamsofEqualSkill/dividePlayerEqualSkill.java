package DividePlayersIntoTeamsofEqualSkill;

import java.util.Arrays;

public class dividePlayerEqualSkill {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        dividePlayers(new int[] { 3, 2, 5, 1, 3, 4 });
        // [5,1][4,2][3,3]
    }

    public static long dividePlayers(int[] skill) {

        int len = skill.length;

        if (len == 2) {
            return skill[0] * skill[1];
        }

        int strongerCount = len - 1;
        long result = 0;
        Arrays.sort(skill);

        long temp = skill[0] * skill[strongerCount];

        for (int i = 0; i < len / 2; i++) {
            if (i != 0) {
                if (temp != skill[i] * skill[strongerCount])
                    return -1;
            }

            result += skill[i] * skill[strongerCount];
            strongerCount--;
        }

        return result;

    }

}
