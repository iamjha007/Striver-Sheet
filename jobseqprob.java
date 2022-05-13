public class jobseqprob {
    int[] JobScheduling(Job arr[], int n)
    {
        
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
       int sd[]=new int[n+1];
       
       int profit=0;
       
       int jobsdone=0;
       
       for(int i=0;i<n;i++){
           
           int ded=arr[i].deadline;
           if(ded>n)
             ded=n;
           while(ded>0&&sd[ded]!=0) ded--;
           if(ded<=0)
             continue;
           sd[ded]=arr[i].id;
        //   System.out.println(arr[i].profit+" "+arr[i].id);
           profit=profit+arr[i].profit;
           jobsdone++;
           
       }
        return new int[]{jobsdone,profit};
    }
}
