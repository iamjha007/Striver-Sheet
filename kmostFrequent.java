public class kmostFrequent {
    class heapNode{
        int ele;
        int freq;
        
        heapNode(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }
        
    }
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            
            HashMap<Integer,Integer> map=new HashMap<>();
            
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
                
            
            PriorityQueue<heapNode> pq=new PriorityQueue<>((a,b)->a.freq-b.freq);
            
            for(Map.Entry ele:map.entrySet()){
                
                if(pq.size()<k)
                    pq.add(new heapNode((int)ele.getKey(),(int)ele.getValue()));
                else
                if(pq.peek().freq<(int)ele.getValue()){
                    pq.poll();
                    pq.add(new heapNode((int)ele.getKey(),(int)ele.getValue()));
                }
            }
            
            int ans[]=new int[k];
            
            for(int i=0;i<k;i++)
                ans[i]=pq.poll().ele;
           return ans;
        }
    }
}
