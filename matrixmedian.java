public class matrixmedian {
    
    public int findMedian(int[][] A) {
        
        int n=A.length;
        int m=A[0].length;

        int low=1;
        int high=(int)1e9;

        while(low<=high){

            int mid=(low+high)>>1;
            int count=0;
            for(int i=0;i<n;i++){
                count+=find(A[i],mid);
            }

            if(count<=(n*m)/2)  
               low=mid+1;
            else
              high=mid-1;
        }
        return low;
    }

    int find(int arr[],int ele){

        int n=arr.length;

        int low=0;
        int high=n-1;
        while(low<=high){

            int mid=(low+high)/2;
            
            if(arr[mid]>ele)
               high=mid-1;
            else
              low=mid+1;
        }
        return low;
    }
}
