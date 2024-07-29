class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        for(int j = 0 ; j < n ; j++){
            int lessLeft = 0 , greaterLeft = 0;
            int lessRight = 0 , greaterRight = 0;

            for(int i = 0 ; i < j ; i++){
                if(rating[i] > rating[j]) greaterLeft++;
                if(rating[i] < rating[j]) lessLeft++;
            }
            for(int k = j+1 ; k < n ; k++){
                if(rating[k] < rating[j]) lessRight++;
                if(rating[k] > rating[j]) greaterRight++;
            }
            count += lessLeft * greaterRight + lessRight * greaterLeft;
        }   
        return count;
    }
}
