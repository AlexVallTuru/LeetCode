public class fibonaccuNumber {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

    }

    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int temp = 0;
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n - 1; i++) {
            temp = num2;
            num2 += num1;
            num1 = temp;
        }

        return num2;

    }

}