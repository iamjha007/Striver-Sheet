public class addtwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(0,null);
        ListNode temp=dummy;
           
       int c=0;
       while(l1!=null||l2!=null||c!=0){
           int sum=0;
           if(l1!=null){
               sum=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               sum=sum+l2.val;
               l2=l2.next;
           }
          sum=sum+c;
           c=sum/10;
           sum=sum%10;
           temp.next=new ListNode(sum,null);
           temp=temp.next;
       }
           return dummy.next;
       }
       
}
