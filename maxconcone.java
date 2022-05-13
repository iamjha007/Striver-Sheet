public class maxconcone {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        
        int i=0;
        while(i<n){
            int len=0;
            while(i<n&&nums[i]!=0){
                len++;
                i++;
            }
            max=Math.max(max,len);
            i++;
        }
        return max;
    }
}
