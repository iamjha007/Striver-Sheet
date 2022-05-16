public class comsum1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        List<Integer> list=new ArrayList<Integer>();
        
        combinationsSum(candidates,0,ans,list,target);
        
        return ans;
    }
    
    public void combinationsSum(int[] nums,int index,List<List<Integer>> ans,List<Integer> list,int target){
        
        
        //base case
         if(target==0)
        {
            
            ans.add(new ArrayList<>(list));
            return;
        }
        
        if(target<0||index>=nums.length)
            return;
       
        
        list.add(nums[index]);
        combinationsSum(nums,index,ans,list,target-nums[index]);
        list.remove(list.size()-1);
        combinationsSum(nums,index+1,ans,list,target);
        
        
    }
}
