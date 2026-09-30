class Solution {
    void twosum(int []nums,int tar,int i , int j ,List<List<Integer>>ans){
         while(i<j){
            if(nums[i]+nums[j]>tar){
                j--;
            }
            else if(nums[i]+nums[j]<tar){
                i++;
            }
            else{
                List<Integer>temp = new ArrayList<>(); 
                while(i<j && nums[i]==nums[i+1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j-1]){
                    j--;
                }

                temp.add(-tar);
                temp.add(nums[i]);
                temp.add(nums[j]);
                ans.add(temp);
                i++;
                j--;
            }
         }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>>ans = new ArrayList<>();
    
      for(int i = 0 ; i < nums.length ; i++){
         if(i>0 && nums[i]==nums[i-1]){
            continue;
         }
         int tar = -nums[i];
         twosum(nums,tar,i+1,nums.length-1,ans);
        
      }
     return ans;   
    }
}
