package leetCode;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null)
    		return null;
        ListNode next=head.next;
        ListNode curNode=head;
        while(next!=null)
        {
        	if(next.val!=curNode.val)
        	{
        		curNode=next;
        		next=next.next;
        	}
        	else {
        		curNode.next=next.next;
				next=next.next;
			}
        
        }
        return head;
    }
}
