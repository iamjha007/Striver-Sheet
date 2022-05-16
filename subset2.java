public class subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,0,ans,new ArrayList<Integer>(),nums.length);
        return ans;
        
    }
    
    public void subset(int[]  nums,int index, List<List<Integer>> ans,ArrayList<Integer> list,int n){
       
          ans.add(new ArrayList<>(list));
        for(int i=index;i<n;i++){
            
           if(i!=index&& nums[i]==nums[i-1]) continue;
            
            list.add(nums[i]);
            subset(nums,i+1,ans,list,n);
            list.remove(list.size()-1);
        }
       
        
        
    }
}
