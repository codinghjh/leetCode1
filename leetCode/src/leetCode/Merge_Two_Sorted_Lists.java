package leetCode;

public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode newhead=head;
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        
        while(l1!=null&&l2!=null)
        {
        	if(l1.val<l2.val)
        	{
        		head.next=l1;
        		l1=l1.next;
        		head=head.next;
        	}
        	else {
				head.next=l2;
				l2=l2.next;
				head=head.next;
			}
        }
        if(l1==null)
        	head.next=l2;
        if(l2==null)
        	head.next=l1;
        return newhead.next;
    }
}
