// Leetcode 206 - Reverse a Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next;
 * }
 */
import java.util.*;
class LinkedList {
    public class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public ListNode head = null;
    public ListNode tail = null;
    public void add(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public ListNode reverseList(ListNode head) {
        // Recursively
        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode newHead = reverseList(head.next);
        // ListNode headNext = head.next;
        // headNext.next = head;
        // head.next = null;
        // return newHead;
        
        // Iteratively
            ListNode curr = head;
            ListNode prev = null;
            ListNode next = null;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
    }
    public void print(){
        ListNode current = head;
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListImp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            ll.add(x);
        }
        ll.print();
        ll.head = ll.reverseList(ll.head);
        ll.print();
        sc.close();
    }
}

