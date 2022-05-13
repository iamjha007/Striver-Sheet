public class rotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||head.next==null||k==0)
            return head;
         
        int len=1;
        ListNode temp=head;
         
        while(temp.next!=null)
        {
            len++;
            temp=temp.next;
        }
         temp.next=head;
       k=k%len;
       k=len-k; 
       temp=head;
       for(int i=1;i<k;i++){
           temp=temp.next;
       }
         head=temp.next;
         temp.next=null;
       return head;
     }
}
