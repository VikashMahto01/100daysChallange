class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean col0 = false;
    // first pass to mark the zeroes int the first row/ column
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                col0 = true;
            }
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // second pass to set the zeroes based on the markers in the first row/ column
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] !=0 ){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // zero out the first row if needed
         if(matrix[0][0] == 0){
            for(int j=1; j<n; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}