public class copyLLwithrandptr {
    
                                                               /* Solution 1  O(n) space    */
    public Node copyRandomList(Node head) {
        
      HashMap<Node,Node> map=new HashMap<>();
      
        Node temp=head;
       //map returns null if a key is not present in the map
        while(temp!=null){
            
            Node node=new Node(temp.val);
            map.put(temp,node);
            temp=temp.next;
        }
        
        temp=head;
     
        
        while(temp!=null){
          
            map.get(temp).next=map.get(temp.next);
            map.get(temp).random=map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }

                                                                   /* Solution 1  O(1 ) space    */

    
}
