class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int originalVal = x;

        if(originalVal < 0){
            return false;
        }

        while(x != 0){
            int rem = x % 10;
            sum = sum*10 + rem;
            x /= 10;
        }

        if(originalVal == sum){
            return true;
        }
        return false;
    }
}