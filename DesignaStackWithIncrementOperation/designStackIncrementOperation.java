package DesignaStackWithIncrementOperation;

public class designStackIncrementOperation {

    public static void main(String[] args) {

        System.out.println("Hello LeetCoder!!");

        CustomStack stack = new CustomStack(10);
        stack.push(5);
        int value = stack.pop();
        stack.increment(3, 100);
    }

}

class CustomStack {

    private int[] customStk;
    private int maxSize;
    private int top;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        customStk = new int[maxSize];
        this.top = -1;
    }

    public void push(int x) {
        if(top < maxSize -1){
            customStk[++top] = x;
        }
    }

    public int pop() {
        if(top >= 0){
            return customStk[top--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int len = 0;
        if(top + 1 <= k){
            len = top + 1;
        } else {
            len = k;
        }
        for (int i = 0; i < len; i++) {
            customStk[i] = customStk[i] + val;
        }
    }
}