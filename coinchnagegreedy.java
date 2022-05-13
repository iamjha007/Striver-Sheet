public class coinchnagegreedy {
    public static int findMinimumCoins(int amount)
    {
       int arr[]={1, 2, 5, 10, 20, 50, 100, 500, 1000};
	   int n=arr.length;
	  
	  int count=0;
	   for(int i=n-1;i>=0&&amount>0;i--){
		   int coin=amount/arr[i];
		  count+=coin;
		   amount=amount-coin*arr[i];
	   }
	return count;
    }
}
