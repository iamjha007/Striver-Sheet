public class palindromepart {
    
    public List<List<String>> partition(String s) {
        
        List<List<String>> ans=new ArrayList<>();
        
        partitions(s,ans,new ArrayList<>(),0);
        return ans;
    }
    public void partitions(String s,List<List<String>> ans,ArrayList<String> list,int index){
        
        if(index>=s.length())
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
      
        for(int i=index;i<s.length();i++){
            
            if(ispal(s.substring(index,i+1))){
                
                list.add(s.substring(index,i+1));
                
                partitions(s,ans,list,i+1);
                
                list.remove(list.size()-1);
                
            }
        }
        
    }
    
    boolean ispal(String s){
        int n=s.length();
        
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}
