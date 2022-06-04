import java.util.*;

public class HeapImplementations {
   static ArrayList<Integer> heap;
   static int size;

   static int leftChild(int i){
       return 2*i+1;
   }
   static int rightChild(int i){
       return (2*i+2);
   }
   static int parent(int i){
       return ((i-1)/2);
   }
   static boolean isLeaf(int i){
       if(i>size/2)
       return true;
       return false;
   }
   public static void main(String[] args) {

       Scanner s=new Scanner(System.in);
       int choice=s.nextInt();
       heap=new ArrayList<>();
       size=0;
       while(true){
         
           
           if(choice==1){
            
            int val=s.nextInt();
            insert(val);
           }
           if(choice==2){
               
               delete();
               
           }
           if(choice==3)
              System.out.println(heap);
           if(choice==4){
               break;
           }
           System.out.println("Enter your choice");
           choice=s.nextInt();
             
       }
   }

private static void delete() {

 System.out.println("The popped element is:"+heap.get(0));
 swap(0,size-1);
 heap.remove(heap.size()-1);
 size--;
 heapify(0);
}

private static void swap(int i, int j) {
    
    int temp=heap.get(i);
    heap.set(i, heap.get(j));
    heap.set(j,temp);

}

//minheap
private static void insert(int val) {
   
    heap.add(val);
    int i=size;
    System.out.println(size);

    while(i>0 && val<heap.get((i-1)/2)){
        heap.set(i, heap.get((i-1)/2));
        i=(i-1)/2;
    }
    heap.set(i, val);
    size++;
    System.out.println(heap);


}
private static void heapify(int index){
    
   if(isLeaf(index))
       return;
    
    int i=leftChild(index);
    int val=heap.get(index);
    while(i<size){
     
        if(i+1<size && heap.get(i)>heap.get(i+1)){
          i++;
        }
        if(heap.get(i)>=val){
            break;
        }
        heap.set((i-1)/2, heap.get(i));
        i=i*2+1;
     }
      heap.set((i-1)/2,val);

    }

}
