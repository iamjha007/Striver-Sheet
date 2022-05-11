public class xountxorsubarr {
    public int solve(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        int xor=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
           int req=xor^k;
            
            if(map.containsKey(req))
               count+=map.get(req);
             if(xor==k)
                 count++;
            if(map.containsKey(xor))
               map.put(xor,map.get(xor)+1);
            else
               map.put(xor,1);
            
            

        }
        return count;
}
