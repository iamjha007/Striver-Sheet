
    import java.util.*;
    public class longestCons {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
       int ans= longestConsecutive(arr);
       System.out.println(ans);
    }
    public static int longestConsecutive(int[] arr) {
     
                
                int n=arr.length;
                Arrays.sort(arr);
                
                int maxlen=Integer.MIN_VALUE;
                
               int i=0;
                while(i<n){
                    
                    int len=1;
                    while(i+1<n && arr[i+1]==arr[i]+1){
                        len++;
                        i++;
                    }
                    maxlen=Math.max(len,maxlen);
                }
                return maxlen;
            }
}

