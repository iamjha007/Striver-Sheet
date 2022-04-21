public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int arr[]=new int[2];
        for(int i=0;i<n;i++){
            
            if(map.containsKey(target-nums[i])){
                  arr[0]=i;
                 arr[1]=map.get(target-nums[i]);
                break;
        }
         
                map.put(nums[i],i);
        }

     return arr;
    }