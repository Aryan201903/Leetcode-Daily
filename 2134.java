// Minimum Swaps to Group All 1's Together II
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int cOne = 0;
        for (int num : nums) {
            if (num == 1) {
                cOne++;
            }
        }
        int cZero = 0;
        for (int i = 0; i < cOne; i++) {
            if (nums[i] == 0) {
                cZero++;
            }
        }
        int minSwaps = cZero;
        for (int i = cOne; i < n + cOne; i++) {
            if (nums[i % n] == 0) {
                cZero++;
            }
            if (nums[(i - cOne) % n] == 0) {
                cZero--;
            }
            minSwaps = Math.min(minSwaps, cZero);
        }
        return minSwaps;
    }
}
