public class longworepete {
                          /* my method of code */
        public int lengthOfLongestSubstring(String s) {
            
            int n=s.length();
                                                       
           if(s.length()<=1)
               return s.length();
                                                       
           HashSet<Character> set=new HashSet<>();
            
            int i=0;
            int j=1;
            int ans=1;
            set.add(s.charAt(0));
            while(j<n){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    ans=Math.max(ans,j-i);
                     
                    while(s.charAt(i)!=ch){set.remove(s.charAt(i)); i++;  }
                    set.remove(s.charAt(i)); i++;
                }
                else{
                    set.add(ch);
                j++;
                }
                
            }
            
            ans=Math.max(ans,j-i);
                
            return ans;
        }

}
