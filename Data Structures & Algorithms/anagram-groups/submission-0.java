class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        HashMap<String ,List<String>>ans=new HashMap<>();
        for(int i = 0 ; i < strs.length ; i++){
            String s = strs[i];
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }

            ans.get(key).add(s);
        }
        for(Map.Entry<String, List<String>>e:ans.entrySet()){
           res.add(e.getValue());
        }
      return res;  
    }
}
