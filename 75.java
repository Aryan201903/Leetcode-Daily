class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int left = 0;
        int right = nums.length - 1;
        while(i <= right){
            if(nums[i] == 2){
                swap(nums , i , right);
                right--;
            }
            else if(nums[i] == 0){
                swap(nums , i , left);
                left++;
                i++;
            }
            else{
                i++;
            }
        }

    }
    void swap(int []arr , int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
