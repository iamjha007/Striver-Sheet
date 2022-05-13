public class 3sumprob {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
      
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int i=0;i<n-2;i++){
           
            
            int target=0-nums[i];
            int j=i+1;
            int k=n-1;
            while(j<k){
                
                int sum=nums[j]+nums[k];
                 
                if(sum==target){
                    
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                   ans.add(list);
                       
                while(j<k&&list.get(2)==nums[k]) k--;
                while(j<k&&list.get(1)==nums[j])j++;
                }
                else if(sum>target)
                    k--;
                else
                    j++;
           
            }
            while(i+1<n && (0-target)==nums[i+1]) i++;
            
        }
        
       
        return ans;
    }
}
