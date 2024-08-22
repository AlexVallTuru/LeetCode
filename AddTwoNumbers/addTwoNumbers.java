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

        while (curr1 != null || curr2 != null) {
            int sum = carry;

            if (curr1 != null) {
                sum += curr1.val;
                curr1 = curr1.next;
            }

            if (curr2 != null) {
                sum += curr2.val;
                curr2 = curr2.next;
            }

            carry = sum / 10;
            sol.next = new ListNode(sum % 10);
            sol = sol.next;
        }

        if (carry != 0) {
            sol.next = new ListNode(carry);
        }

        return solHead.next;
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
