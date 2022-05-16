public class subsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       
        return subsetSums(arr,0,0,N);
        
     }
     ArrayList<Integer> subsetSums(ArrayList<Integer> arr,int i,int sum, int N){
        
       if(i>=N){
          ArrayList<Integer> ls=new ArrayList<Integer>();
          ls.add(sum);
          return ls;
       }
         ArrayList<Integer> list1=subsetSums(arr,i+1,sum+arr.get(i),N);
         ArrayList<Integer> list2=subsetSums(arr,i+1,sum,N);
         list1.addAll(list2);
         return list1;
       
       
     }
}
