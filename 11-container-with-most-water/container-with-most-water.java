class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int maxWater = 0;

       while(left < right){
           // calculate the width between the two vertical lines

           int width = right - left;

    //calculate the height of the container(minimum height of the two line)

        int containerHeight = Math.min(height[left], height[right]);

        //calculate the area and update maxWater if a larger area is found

        int currentArea = width*containerHeight;

        maxWater = Math.max(maxWater, currentArea);

        // Move the pointers inward

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
       }

       return maxWater;
    }
}