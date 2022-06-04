public class mergeKsorted {
    class heapNode{
    
        int ele;
        int i;
        int j;
        
        heapNode(int ele,int i,int j){
            this.ele=ele;
            this.i=i;
            this.j=j;
        }
    }
    class Solution
    {
        //Function to merge k sorted arrays.
        public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
        {
            
          PriorityQueue<heapNode> pq=new PriorityQueue<>((a,b)->a.ele-b.ele);
          
          for(int i=0;i<arr.length;i++){
            
                  pq.add( new heapNode(arr[i][0],i,0));
          }
          
          
          
          
          ArrayList<Integer> list=new ArrayList<Integer>();
          while(!pq.isEmpty()){
              heapNode node=pq.poll();
               list.add(node.ele);
               
               if(node.j+1<K)
               pq.add(new heapNode(arr[node.i][node.j+1],node.i,node.j+1));
               
          }
          
        
          
            
        return list;
            
        }
    }
}
