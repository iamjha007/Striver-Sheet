public int reversePairs(int[] nums) {
        
	if(nums.length==0)
		return 0;
	
   return mergeSort(nums,0,nums.length-1);
}


static int mergeSort(int[] nums,int si,int ei){
	
	if(si>=ei)
		return 0;
	
	int mid=(si+ei)/2;
	
	int count=0;
	count+=mergeSort(nums,si,mid);
	count+=mergeSort(nums,mid+1,ei);
	count+=countPair(nums,si,ei);
	return count;
}

static int countPair(int []arr,int si,int ei){
	
	int mid=(si+ei)/2;
	int i=si;
	int j=mid+1;
	int count=0;
	
	 while(i<=mid&&j<=ei){
		 
	   
		 if((long)arr[i]>(long)2*arr[j]){
			 count=count+mid-i+1;
			 j++;
		 }
		 else{
			 i++;
		 }
		 
	 }
	Arrays.sort(arr,si,ei+1);
  System.out.println(count);
	return count;
	
}
