class Solution {
    public int heightChecker(int[] heights) {
        int[] height = new int[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            height[i] = heights[i];
        }
        Arrays.sort(height);
        int count = 0;
        for(int i = 0 ; i < height.length ; i++){
            if(height[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
