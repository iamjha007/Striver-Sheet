public class Nmeetinginroom {
    public static int maxMeetings(int start[], int end[], int n)
    {
       if(n<=1) return n;
       ArrayList<Pair> list=new ArrayList<>();
       
       for(int i=0;i<n;i++){
           
           Pair pr=new Pair(start[i],end[i]);
           list.add(pr);
       }
       Collections.sort(list,(a,b)->a.end-b.end);
       
       int count=1;
       
       int lend=list.get(0).end;
       
       
       for(int i=0;i<n;i++){
           int lstart=list.get(i).start;
           if(lstart<=lend)
              continue;
              
          
            count++;
          lend=list.get(i).end;
           
           
       }
       return count; 
    }
}
