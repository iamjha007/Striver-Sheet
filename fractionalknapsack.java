public class fractionalknapsack {
    double fractionalKnapsack(int w, Item ans[], int n) 
    {
    
       Arrays.sort(ans,(a,b)->{
           if((double)((double)a.value/a.weight)<((double)b.value/b.weight))
              return 1;
            else
             return -1;
       });
       
       double val=0;
       int i=0;
       
      while(w>0&&i<n){
          
          if(ans[i].weight<w){
              w=w-ans[i].weight;
              val+=ans[i].value;
              i++;
          }
          else{
              val=val+w*((double)ans[i].value/ans[i].weight);
              w=0;
            break;
          }
      }
      return val;
    }
}
