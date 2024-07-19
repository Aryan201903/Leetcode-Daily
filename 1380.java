class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ; i++){
            int min_idx = 0 , min = Integer.MAX_VALUE;
            for(int j = 0 ; j < n; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                    min_idx = j;
                }
            }
            boolean ans = true;
            for(int k = 0 ; k < matrix.length ; k++){
                if(matrix[i][min_idx] < matrix[k][min_idx]){
                    ans = false;
                    break;
                }
            }
            if(ans) result.add(matrix[i][min_idx]);
        }
        return result;
    }
}
