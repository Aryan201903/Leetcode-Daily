class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int aDel = 0;
        for(char a : s.toCharArray()){
            if(a == 'b') bCount++;
            else aDel = Math.min(aDel+1 , bCount);
        }
        return aDel;
    }
}
