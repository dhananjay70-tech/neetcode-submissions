class Solution {
    public int characterReplacement(String s, int k) {
       HashMap <Character,Integer> m = new HashMap<>();
       int l = 0 ;
       int r = 0 ;
       int ans = 0 ;
       int mx_f = 0;
       while(r<s.length()){
        char ch = s.charAt(r);
    m.put(ch,m.getOrDefault(ch,0)+1);
      mx_f=Math.max(mx_f,m.get(ch));
   
          while(r-l+1-mx_f>k){
            char p = s.charAt(l);
            m.put(p,m.get(p)-1);
           if(m.get(p)== 0){
            m.remove(p);
           } 
           l++;
          }
        

   
       ans =Math.max(ans,r-l+1);
       
        r++;

    }
       
       return ans;
  } 
}



















