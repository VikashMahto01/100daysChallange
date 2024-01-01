class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int last = nums.length-1;

        while(start < last){
            int mid = start + (last - start)/2;

            int mid2 = mid + 1;

            if(nums[mid] < nums[mid2]){
                start = mid2;
            } else {
                last = mid;
            }
        }
        return start;
    }
}