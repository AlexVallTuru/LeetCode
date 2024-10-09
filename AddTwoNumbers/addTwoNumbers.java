public class addTwoNumbers {

    public static void main(String[] args) {

        System.out.println("Hello World!");

    }

    public ListNode adddTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        return createListResult(l1, l2, carry);

    }

    private ListNode createListResult(ListNode l1, ListNode l2, int carry) {

        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;

        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        
        ListNode result = new ListNode(sum % 10);
        carry = sum / 10;

        result.next = createListResult(l1, l2, carry);

        return result;

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
