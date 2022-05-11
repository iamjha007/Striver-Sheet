int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
           sum=sum+arr[i];
           if(sum==0)
             maxlen=i+1;
            else
           if(map.containsKey(sum))
             {
              maxlen=Math.max(maxlen,i-map.get(sum));  
             }
             else
             map.put(sum,i);
        }
        return maxlen;
    }vs 