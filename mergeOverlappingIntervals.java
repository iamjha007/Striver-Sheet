
//got through striver sheet soln as well it is much better
public int[][] merge(int[][] intervals) {
    int n=intervals.length;
   
    if(intervals.length<=1)
        return intervals;
          
        Arrays.sort(intervals,(int[] a,int[] b)->a[0]-b[0]);
      
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
      
       int si=intervals[0][0];
       int ei=intervals[0][1];
      int j=1;
      while(j<intervals.length){
          
          while(j<intervals.length&&ei>=intervals[j][0])
          {
              ei=Math.max(ei,intervals[j][1]);
              j++;
          }
          
          ArrayList<Integer> slist=new ArrayList<>();
          slist.add(si);
          slist.add(ei);
          list.add(slist);
          
          if(j==intervals.length-1){
              slist=new ArrayList<>();
              slist.add(intervals[j][0]);
              slist.add(intervals[j][1]);
               list.add(slist);
              break;
          }
          else if(j<intervals.length){
          si=intervals[j][0];
          ei=intervals[j][1];
          j++;
          }
      }
      
      int ans[][]=new int[list.size()][2];
      for(int i=0;i<list.size();i++){
          ans[i][0]=list.get(i).get(0);
          ans[i][1]=list.get(i).get(1);
      }
      return ans;
  }