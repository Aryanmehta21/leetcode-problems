// Leetcode - 234
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
       if(head == null){
           return true;
       } 
       while(slow!=null){
           if(fast.val != slow.val){
               return false;
           }
           fast = fast.next;
           slow = slow.next;
       }
       return true;
    }

    
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}