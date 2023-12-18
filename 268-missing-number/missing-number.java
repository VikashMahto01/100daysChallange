class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int actualSum = (range*(range+1))/2; // (n*(n+1))/2

        //actual sum when missing number is present

        int currSum = 0;

        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
        }

        int ans = actualSum-currSum;

        return ans;
    }
}