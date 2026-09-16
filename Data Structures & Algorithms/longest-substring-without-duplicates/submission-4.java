class Solution {
    public int lengthOfLongestSubstring(String s) {
          if(s.length()==0)return 0;
          if(s.length()==1)return 1;
      int ans = 0 ;
      int l = 0 ;
      int r = 0 ;
      HashSet<Character>st = new HashSet<>();
      
    if(s.charAt(0)==' ')return 1;
 
    while(r<s.length()){
       
        if(st.contains(s.charAt(r))){
           
        while(st.contains(s.charAt(r))){
            st.remove(s.charAt(l));
            l++;
          }    
        }
        st.add(s.charAt(r));
         ans=Math.max(ans,st.size());
         r++;
      }
      return ans;
    }
}
