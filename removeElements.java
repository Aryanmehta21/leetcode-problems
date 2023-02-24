// Leetcode - 203
class Solution {
    public ListNode removeElements(ListNode head, int val) {
      ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        // Iterate through the list
        while (head != null) {
            // If the current node's value is equal to val, skip over it by updating the previous node's next pointer
            if (head.val == val) {
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;
        }
        
        // Return the new head of the list
        return dummy.next;  
    }
}