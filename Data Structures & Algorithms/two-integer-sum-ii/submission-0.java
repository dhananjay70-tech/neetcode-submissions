class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int ans[]=new int[2];   
    HashMap<Integer, Integer>m = new HashMap<>();
    for(int i = 0 ; i<numbers.length;i++){
        int p = target-numbers[i];
        if(!m.containsKey(p)){
           
            m.put(numbers[i],i);
        }
        else{
           ans[0]=m.get(p)+1;
          ans[1]=i+1;
        }
    }

return ans;
    }
}
