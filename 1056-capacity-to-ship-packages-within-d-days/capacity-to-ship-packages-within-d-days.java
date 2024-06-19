class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = getMax(weights);
        int right = getSum(weights);

        while(left < right){
            int mid = left + (right - left)/2;
            if(canShip(weights, days, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean canShip(int[] weights, int days, int capacity){
        int currentDays = 1;
        int currentWeight = 0;

        for(int weight : weights){
            if(currentWeight + weight >capacity){
                currentDays++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        return currentDays <= days;
    }

    private int getMax(int[] weights){
        int max = weights[0];
        for(int weight : weights){
            if(weight > max){
                max = weight;
            }
        }
        return max;
    }

    private int getSum(int[] weights){
        int sum = 0;
        for(int weight : weights){
            sum += weight;
        }
        return sum;
    }
}