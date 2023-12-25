class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        if(n < 3){
            return false;
        }

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int k : nums){
            if(k <= i ){
                i = k;
            } else if(k <= j){
                j = k;
            } else {
                // we found a triplet (i < j < k)

                return true;
            }
        }
        // No triplet found
        return false;
    }
}