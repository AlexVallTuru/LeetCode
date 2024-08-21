public class addTwoNumbers {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

    public ListNode adddTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode sol = new ListNode(-1);
        ListNode solHead = sol;

        int carry = 0;


        return curr1;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
