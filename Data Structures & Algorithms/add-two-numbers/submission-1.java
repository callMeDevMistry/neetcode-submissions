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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode res = dummy;
        int carry = 0;
        
        while(l1!=null && l2!=null){
            int val = l1.val + l2.val;
            if(carry>0){
                val+=carry;
                carry--;
            }
            if(val>9){
                val%=10;
                carry++;
            }

            res.next = new ListNode(val);
            res=res.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int val = l1.val;
            if(carry>0){
                val+=carry;
                carry--;
            }
            if(val>9){
                val%=10;
                carry++;
            }
            res.next = new ListNode(val);
            res=res.next;
            l1=l1.next;
        }

        while(l2!=null){
            int val = l2.val;
            if(carry>0){
                val+=carry;
                carry--;
            }
            if(val>9){
                val%=10;
                carry++;
            }
            res.next = new ListNode(val);
            res=res.next;
            l2=l2.next;
        }

        if(carry!=0){
            res.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
