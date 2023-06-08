/*
@id         1480
@title      Running Sum of 1d Array
@tag        
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
