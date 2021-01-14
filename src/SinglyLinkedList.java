public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Generic Type

    /*
     * //head is instance variable
     * head = new ListNode(10);
     * ListNode second = new ListNode(1);
     * ListNode third = new ListNode(8);
     * ListNode fourth = new ListNode(11);
     * head.next = second;
     * second.next = third;
     * third.next = fourth;
     *
     * */
}
