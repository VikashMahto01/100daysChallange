class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                return true;
            }

            // check if the left side is sorted
            if(nums[left] < nums[mid] || nums[left] == nums[mid] && nums[mid] > nums[right]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            //Right side must be sorted
            else if(nums[mid] < nums[right] || nums[left] == nums[mid] && nums[mid]< nums[right]){
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // We can't decide which part is sorted
            else{
                if(nums[left] == nums[mid]){
                    left++;
                }
                if(nums[right] == nums[mid]){
                    right--;
                }
            }
        }
        return false;
    }
}