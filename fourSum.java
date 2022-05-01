class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
    for(int i=0;i<n-3;i++){
        for(int j=i+1;j<n-2;j++){
            
            int val=target-nums[i]-nums[j];
            int start=j+1;
            int end=n-1;
            while(start<end){
                if(nums[start]+nums[end]>val)
                    end--;
                else if(nums[start]+nums[end]<val)
                    start++;
                else{
                    List<Integer> ls=new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[start]);
                    ls.add(nums[end]);
                    list.add(ls);
                   while(start<end && nums[start]==ls.get(2)) start++;
                
                while(start<end && nums[end]==ls.get(3)) end--;
                        
                }
                    
            }
            while(j+1<n &&nums[j+1]==nums[j]) j++;
            
        }
        while(i+1<n && nums[i+1]==nums[i]) i++;
    }
        return list;
    }
}