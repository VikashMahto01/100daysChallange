class Solution {
    public int search(int[] nums, int target) {
        // special case
        if(nums == null || nums.length == 0){
            return -1;
        }

        // left and right pointers int the array

        int left = 0;
        int right = nums.length-1;

        // first step  is to find the pivot where the array is sorted

        while(left < right){
            // Middle pointer

            int mid = left + (right - left)/2;

            //if the element at the mid is greater then the element at the right then we can say that the array is rotated after the middle index

            if(nums[mid] > nums[right]){
                left = mid + 1;
            } // else the pivot int left part
            else{
                right = mid;
            }
        } 

        // After the above loop is completed then the left index will point to the pivot;

        int pivot = left;
        left = 0;
        right = nums.length -1;

        // Now we will find in which half of the array, our target is present

        if(target >= nums[pivot] && target <= nums[right]){
            left = pivot;
        } else {
            right = pivot;
        }
        // Now perform binary search

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            } else if(target < nums[mid]){
                right = mid -1;
            } else {
                left = mid +1;
            }
        }

        return -1;
    }
}