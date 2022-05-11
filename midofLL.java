public class midofLL {
    public ListNode middleNode(ListNode head) {
        
        if(head==null||head.next==null)
            return head;
        
     ListNode ter=head;
     ListNode hare=head;
        while(hare!=null&&hare.next!=null){
            hare=hare.next.next;
            ter=ter.next;
            
        }
        return ter;
    }  
}
