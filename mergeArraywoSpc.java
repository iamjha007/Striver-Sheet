 public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n==0)
            return;
        
        int i=0;
        int j=0;
    
        
        while(i<m&&j<n){
            
            if(nums1[i]>nums2[j]){
                ArrayShift(nums1,i,++m);
               
                nums1[i++]=nums2[j++];
            }
            else
                i++;
        }
        
        while(j<n){
            nums1[m++]=nums2[j++];
            
        }
    }
    public static void ArrayShift(int arr[],int index,int n){
        
        for(int i=n-1;i>index;i--){
            arr[i]=arr[i-1];
            
        }
    }