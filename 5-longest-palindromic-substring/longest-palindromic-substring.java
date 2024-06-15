class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];// create a boolean table to store results

        String ans = "";
        int maxLen = 0;

        // single-character palindromes
        for(int i=0; i<n; i++){
            dp[i][i] = true;
            ans = s.substring(i, i+1);
            maxLen = 1;
        }

        //Two-character palindromes
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                maxLen = 2;
                ans = s.substring(i, i+2);
            }
        }

        // Palindromes of length 3 or more
        for(int len = 3; len<=n; len++){
            for(int i=0; i<n-len+1; i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    maxLen = len;
                    ans = s.substring(i, j+1);
                }
            }
        }
        return ans;
    }
}