package leetCode;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
public class Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
        return null;
        int lengthA=0;
        int lengthB=0;
        ListNode headT=null;
        headT=headA;
        while(headT!=null)
        {
            lengthA++;
            headT=headT.next;
        }
        headT=headB;
        while(headT!=null)
        {
            lengthB++;
            headT=headT.next;
        }
        if(lengthA>lengthB)
        {
            for(int i=0;i<lengthA-lengthB;i++)
            {
                headA=headA.next;
            }
        }
        else if(lengthA<lengthB)
        {
            for(int i=0;i<lengthB-lengthA;i++)
            {
                headB=headB.next;
            }
        }
        while(headA!=null&&headB!=null)
        {
            if(headA==headB)
            return headA;
            else
            {
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }


}
