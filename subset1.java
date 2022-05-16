public class subset1 {               //bit manipulation
    public List<List<Integer>> subsets(int[] nums) {
        
        
        int n=nums.length;
        int p=1<<n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<p;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                   list.add(nums[j]); 
                }
            }
           ans.add(list); 
        }
        return ans;
    }

                     //recusrsive
}
