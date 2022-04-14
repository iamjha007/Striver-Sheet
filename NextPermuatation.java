public void nextPermutation(int[] nums) {
    if(nums==null||nums.length<=1)
        return;
    int i=nums.length-2;
    while(i>=0 &&nums[i]>=nums[i+1])  i--;
    
    if(i>=0){
        int j=nums.length-1;
        while(nums[j]<=nums[i]) j--;
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    reverse(nums,i+1,nums.length-1);
        
}
static void reverse(int nums[],int si,int ei)
{
    while(si<ei){
        int temp=nums[si];
        nums[si]=nums[ei];
        
        nums[ei]=temp;
        si++;ei--;
    }
}