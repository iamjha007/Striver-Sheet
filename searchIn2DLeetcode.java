public boolean searchMatrix(int[][] arr, int target) {
        
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        for(;i<n;i++){
            if(arr[i][m-1]==target){
                return true;
           
            }
             if(arr[i][m-1]>target)
                break;
        }
        
        if(i>=n)
        
        int si=0;
        int ei=m-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            
                if(arr[i][mid]==target)
                    return true;
            else if(arr[i][mid]>target){
                ei=mid-1;
            
            }
            else
                si=mid+1;
        }
        return false;
    }