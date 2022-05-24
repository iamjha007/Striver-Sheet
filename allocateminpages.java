public class allocateminpages {
    public int books(int[] A, int B) {
       
        if(B>A.length)  return -1;
       int low=A[0];
       int high=0;
       for(int i:A){
           high+=i;
           low=Math.min(low,i);
       }
       int ans=-1;
       while(low<=high){
 
           int mid=(low+high)>>1;
 
           if(ispossible(A,mid,B)){
             ans=mid;
             high=mid-1;
           }
           else
           low=mid+1;
 
       }
       return ans;
     }
     public boolean ispossible(int[] A,int max,int k){
 
         int stud=1;
         int pages=0;
 
         for(int i=0;i<A.length;i++){
 
             if(A[i]>max)
                return false;
             
             if(pages+A[i]>max){
                 stud++;
                 pages=A[i];
             }
             else
                 pages+=A[i];
         }
 
         if(stud>k)
         return false;
         else 
         return true;
     }
}
