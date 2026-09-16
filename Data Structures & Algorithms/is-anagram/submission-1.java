class Solution {
    public boolean isAnagram(String s, String t) {
      char arr[]=s.toCharArray();
      char num[]=t.toCharArray();

      Arrays.sort(arr);
      Arrays.sort(num);
     if(arr.length != num.length) return false;
      for(int i = 0 ; i < Math.min(num.length,arr.length) ; i++){
        if(arr[i]!=num[i]){
            return false;
        }
      }
      return true;
    }

}
