public class comsum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        combinationsum(candidates,ans,new ArrayList<>(),0,target);
        return ans;
    }
    public void combinationsum(int[] nums,List<List<Integer>> ans,ArrayList<Integer> list,int index,int target){
         if(target==0){
             
             ans.add(new ArrayList<>(list));
             return;
         }
       
        
        for(int i=index;i<nums.length;i++){
            
            if(i!=index && nums[i]==nums[i-1]) continue;
             if(nums[i]>target) break;
            list.add(nums[i]);
            combinationsum(nums,ans,list,i+1,target-nums[i]);
            list.remove(list.size()-1);
            
        }
        
    
    }
}
