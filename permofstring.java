import java.util.*;

public class permofstring {
    public static String getPermutation(int n, int k) {
      
        String set="";
           for(int i=1;i<=n;i++)
               set=set+i;
           
           
           
           ArrayList<String> ans=new ArrayList<>();
           
           perm(ans,set,"");
           Collections.sort(ans);
           
           return ans.get(k-1);
       }
       
      static void perm(ArrayList<String> ans,String set,String str){
           
           if(set.length()==0)
           {
               ans.add(str);
               return;
           }
           
           for(int i=0;i<set.length();i++){
               
              
               perm(ans,set.substring(0,i)+set.substring(i+1,set.length()),str+set.charAt(i));
               
               
           }
           
       }
       public static void main(String[] args) {
           System.out.println(getPermutation(9,2678));
       }
}
