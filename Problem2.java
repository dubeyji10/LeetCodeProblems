/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        if(l1==null){
            if(l2==null){
                   return null;
            } 
            return l2;
        }
        else if(l2==null){
            if(l1==null){
                return null;
            }
            return l1;
        }
        // if((l1.next==null)&&(l2.next!=null)){
        //     return l2;
        // }
        // else if((l1.next!=null)&&(l2.next==null)){
        //     return l1;
        // }
        // else if((l1.next==null)&&(l2.next=null)){
        //     return null;
        // }
        else{
            ListNode sum = new ListNode(0);
            ListNode h3 = sum;
            int carry=0;
            while(l1!=null||l2!=null){
             int last_digit=0;
                int l1_val = 0;
                if(l1!=null)
                {
                    l1_val = l1.val;
                }
                int l2_val = 0;
                if(l2!=null)
                {
                    l2_val = l2.val;
                }
                int curr_sum = l1_val+l2_val+carry;
                
                if(curr_sum==10){
                    carry=1;
                    last_digit = 0;
                }
                else if(curr_sum>10){
                    carry=1;
                    last_digit = curr_sum-10;
                }
                else{
                    carry=0;
                    last_digit = curr_sum;
                }
                
                ListNode new_node = new ListNode(last_digit);
                h3.next = new_node;
                if(l1!=null){
                    l1=l1.next;
                }             
                if(l2!=null){
                    l2=l2.next;
                }
                h3 = h3.next;
            }
            
            if(carry>0){
                ListNode new_node = new ListNode(1);
                h3.next = new_node;
                h3 = h3.next;
            }
                    return sum.next;

        }
    }

    
}
