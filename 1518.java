public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while (numBottles >= numExchange){
            int mod = numBottles % numExchange;
            numBottles/=numExchange;
            sum+=numBottles;
            numBottles+=mod;
        }
        return sum;
    }   
}
