class Solution {
    public int dominantIndex(int[] nums) {
      if(nums.length == 1){
            // if there only one elements its always the dominant index
            return 0;
        }

      int maxIndex = 0;
      int maxNum = nums[0];

      for(int i=1; i<nums.length; i++){
          if(nums[i] > maxNum){
              maxNum = nums[i];
              maxIndex = i;
            }
        }

      for(int i=0; i<nums.length; i++){
          
            if(i != maxIndex && nums[i]*2 > maxNum){
              return -1;
            }
        }
      return maxIndex;
    }
}