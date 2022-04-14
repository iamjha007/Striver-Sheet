 public int maxSubArray(int[] nums) {
        
        long currsum=0;
        long maxsum=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            if(maxsum<currsum)
                maxsum=currsum;
            if(currsum<0)
                currsum=0;
            
        }
        return (int)maxsum;
    }