public class kthLargest {                //Suing Quick Sort alogo partion method

    public int findKthLargest(int[] nums, int k) {
       
        return findKthLargest(nums,0,nums.length-1,nums.length-k);
        
    }
    public static int findKthLargest(int nums[],int si,int ei,int k){
        
        int pivot=partation(nums,si,ei);
        
        if(pivot==k)
            return nums[pivot];
        if(k<pivot)
            return findKthLargest(nums,si,pivot-1,k);
        else
            return findKthLargest(nums,pivot+1,ei,k);
    }
    
    static int partation(int []arr,int low,int high){
        
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        
        while(i<=j){
            while(i<=high && arr[i]<=pivot)
                i++;
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
            
        }
        swap(arr,low,j);
        
        return j;
    }
    static void swap(int[] arr,int i,int j){
        
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }



                                                  //using PriorityQueue

         
    public int findKthLargestt(int[] nums, int k) {
        
        int n=nums.length;
        if(k>n)
            return -1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }
}
}
