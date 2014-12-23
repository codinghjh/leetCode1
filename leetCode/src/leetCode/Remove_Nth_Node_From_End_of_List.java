package leetCode;

public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head.next==null)
    		return head.next;
    	int length=0;
    
        ListNode preNNode=head;
        ListNode preNode=head;
    	while(preNode!=null)
    	{
    		length++;
    		preNode=preNode.next;
    	}
    	if(n==length)
    		return head.next;
        preNode=head;
        for(int i=0;i<n;i++)
        {
        	preNNode=preNNode.next;
        }
        if(preNNode==null)
        {
        	preNode.next=null;
        }
        while(preNNode.next!=null)
        {
        	preNNode=preNNode.next;
        	preNode=preNode.next;
        }
        if(preNode.next!=null)
        	preNode.next=preNode.next.next;
        return head;
    }
    
}
