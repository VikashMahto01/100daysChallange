class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // calculate the product of all elements to the left of each index

        int leftProduct = 1;
        for(int i=0; i<n; i++){
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // calculate the product of all elements to the right of each index

        int rightProduct = 1;

        for(int i=n-1; i>=0; i--){
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}