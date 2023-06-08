/*
@id         1672
@title      Richest Customer Wealth
@tag        
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                accounts[i][0] += accounts[i][j];
            }
        }
        int ans = accounts[0][0];
        for (int i = 1; i < m; i++) {
            ans = Math.max(ans, accounts[i][0]);
        }
        return ans;
    }
}
