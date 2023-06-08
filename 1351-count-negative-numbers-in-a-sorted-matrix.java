/*
@id         1351
@title      Count Negative Numbers in a Sorted Matrix
@tag        
@author     CryoVit
@date       2023/06/08
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int r = 0;
        int c = n - 1;
        int ans = 0;
        while (r < m && c >= 0) {
            if (grid[r][c] < 0) {
                // grid[r...m-1][c] are negatives
                ans += m - r;
                // check grid[r][c-1]
                c--;
            } else {
                // check grid[r+1][c]
                r++;
            }
        }
        return ans;
    }
}
