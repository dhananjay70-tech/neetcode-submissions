class Solution {
    public int[] twoSum(int[] nums, int tar) {
        
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans[]= new int[2];
        for(int i = 0 ; i < nums.length ; i++){
          int p = tar-nums[i];
         
          if(!m.containsKey(p)){
            m.put(nums[i],i);
          }
          else{
            ans[0]=m.get(p);
            ans[1]=i;
          }
        }
        return ans;
    }
}
