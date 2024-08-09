import java.util.HashSet;

public class happyNumber {

    public static void main(String[] args) {

        System.out.println("Hello Happy Number");

        boolean result = isHappy(2);

        System.out.println(result);

    }

    public static boolean isHappy(int n) {

        String numeroStr = String.valueOf(n);
        int numeroTratado = 0;
        HashSet<Integer> registroNumeros = new HashSet<>();

        int result = 0;

        while (numeroTratado != 1) {

            result = 0;

            for (int i = 0; i < numeroStr.length(); i++) {

                char charActual = numeroStr.charAt(i);
                int numActual = Character.getNumericValue(charActual);
                
                result = (int) (result + Math.pow(numActual, 2));

            }
            if (registroNumeros.contains(result)) {
                return false;
            }
            registroNumeros.add(result);
            numeroTratado = result;
            numeroStr = String.valueOf(numeroTratado);
        }

        return true;

    }
}