/*
@id         1342
@title      Number of Steps to Reduce a Number to Zero
@tag        Math
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }
            ans++;
        }
        return ans;
    }
}

// bit manipulation
class Solution2 {
    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            // suppose we will reduce to 0
            // each bit requires >> 1
            // and when it becomes lowest bit, 1-bit requires -1
            ans += (num & 1) == 0 ? 1 : 2;
            num >>= 1;
        }
        // but the goal is to reduce to 1 so last step is not required
        // and special case for 0
        return Math.max(ans - 1, 0);
    }
}
