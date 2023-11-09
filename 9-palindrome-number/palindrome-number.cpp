class Solution {
public:
    bool isPalindrome(int x) {
        double sum = 0;
        int rem, temp;
        temp = x;
        while(x > 0){
            rem = x%10;
            sum = sum*10+rem;
            x = x/10;
        }

        if(temp == sum){
            return true;
        } else {
            return false;
        }
        return false;
    }
};