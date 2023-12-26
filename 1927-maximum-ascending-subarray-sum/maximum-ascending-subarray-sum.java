class Solution {
    public int maxAscendingSum(int[] nums) {
       int maxSum = nums[0];
       int currentSum = nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i - 1]){
               //continue the ascending subarray
               currentSum += nums[i];
            } else{
                // start a new ascending subarray
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }
        }
        maxSum = Math.max(maxSum, currentSum);

        return maxSum;
    }
}