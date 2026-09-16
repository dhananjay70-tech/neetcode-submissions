class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        int mx= 1;

        if(nums.length < 1){
            return 0;
        }
        for(int i = 1 ; i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i]-nums[i-1]==1) cnt++;
                else{
                    mx=Math.max(mx,cnt);
                    cnt=1;
                }
            }
        }
        return Math.max(cnt,mx);
    }
}
