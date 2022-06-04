public class maxsumcomb {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int K) {
        int N=A.size();
       int M=B.size();
        Collections.sort(A);
        Collections.sort(B);
         
 
        PriorityQueue<Integer> pq
            = new PriorityQueue<Integer>();

            for(int i=N-1;i>=0;i--){
                for(int j=M-1;j>=0;j--){

                    if(pq.size()<K)
                        pq.add(A.get(i)+B.get(j));
                    else if(A.get(i)+B.get(j)>pq.peek())
                        {
                            pq.poll();
                            pq.add(A.get(i)+B.get(j));
                        }
                        else
                           break;
                    
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();

            for(int i=0;i<K;i++){
                ans.add(pq.poll());
            }
            Collections.sort(ans,(a,b)->b-a);
            return ans;
    }
}
