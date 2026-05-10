/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int size = 0;
        ListNode curr = head;

        if(head==null)return null;
        if(head.next ==null && n==1)return null;

        while(curr != null){
            size++;
            curr=curr.next;
        }

        if(n==size)return head.next;
        n = size-n;

        curr = head;

        while(n-- > 1){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
