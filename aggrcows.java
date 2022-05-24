import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
			
			int n=s.nextInt();
			int cows=s.nextInt();
			
			int location[]=new int[n];
			for(int i=0;i<n;i++)
			   location[i]=s.nextInt();
            
               Arrays.sort(location);
			   
			   System.out.println(aggrcows(location,n,cows));
		}
	}
    static int aggrcows(int[] arr,int n,int cows){

        if(cows>n)  return -1;

         int low=1;
         int high=arr[n-1]-arr[0];
         int ans=1;

         while(low<=high){

            int mid=(low+high)>>1;

            if(ispossible(arr,mid,cows)){
                ans=mid;
                low=mid+1;

            }else
             high=mid-1;
         }
         return ans;
    }
    public static boolean ispossible(int arr[],int min,int c) {

        int cow=1;
        int cod=arr[0];
        
      for(int i=1;i<arr.length;i++){

        if(arr[i]-cod>=min){
            cod=arr[i];
            cow++;
        }
        if(cow==c)
        return true;
      }
      
      return false;
        
    }
}