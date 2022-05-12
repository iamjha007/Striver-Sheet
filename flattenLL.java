public class flattenLL {
    Node mergeTwoLists(Node a, Node b) {
    Node temp = new Node(0);
        Node res = temp; 
        
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.bottom = a; 
                temp = temp.bottom; 
                a = a.bottom; 
            }
            else {
                temp.bottom = b;
                temp = temp.bottom; 
                b = b.bottom; 
            }
        }
        
        if(a != null) temp.bottom = a; 
        else temp.bottom = b;
        return res.bottom; 
    
    }
    Node flatten(Node root)
    {
       
            if (root == null || root.next == null) 
                return root; 
      
            // recur for list on right 
            root.next = flatten(root.next); 
      
            // now merge 
            root = mergeTwoLists(root, root.next); 
      
            // return the root 
            // it will be in turn merged with its left 
            return root; 
    }
}


/*     Method 2 */

Node flatten(Node root)
    {
     
     Node l2=root.next;
     while(l2!=null){
         if(root.data>l2.data)
         root=merge(l2,root);
         else
         root=merge(root,l2);
         l2=l2.next;
     }
     return root;
    }
    static Node merge(Node l1,Node l2){
        
       Node dummy=l1; 
       Node prev=null;
        
        while(l1!=null && l2!=null){
           
            if(l1.data>l2.data){
               prev.bottom=l2;
               l2=l2.bottom;
                prev=prev.bottom;
               prev.bottom=l1;
              
               
            }
            else{
                prev=l1;
                l1=l1.bottom;
            }
            
         
        }
        
        while(l2!=null)
              {
                 prev.bottom=l2;
               l2=l2.bottom;
                prev=prev.bottom;
               prev.bottom=l1;
              }
                return dummy;
    }
