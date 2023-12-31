class Solution {
    public int findMin(int[] nums) {
      int n = nums.length;
      int left = 0, right = n-1;

      while(left < right){
          int mid = left + (right - left)/2;
              // if the mid element is greater then the rightmost element, then the pivot is on the right side, and the minimum element is on the right.

            if(nums[mid] > nums[right]){
                left = mid+1;
            } else {
              // if the mid element is less then or equal to the rightmost element, then the pivot on the left side and the minimum element is on the left.

              right = mid;
            }
        }

        // the left pointer will point the minimum element after the loop

        return nums[left];
    }
}