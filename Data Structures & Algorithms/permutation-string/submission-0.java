class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()){
            return false;
        }
        char p []= s1.toCharArray(); 
        Arrays.sort(p);
        String tar = new String(p);
        

        int l =0 ;
        int r= 0 ;
        while(r<s2.length()){
            if(r-l+1 == tar.length()){
                String a = s2.substring(l,r+1);
                char b[] = a.toCharArray();
                Arrays.sort(b);
                String c = new String(b);
                if(c.equals(tar)){
                    return true;
                }
                l++;
                
            }
                
                r++; 
            
        }
        return false;
    }
}
