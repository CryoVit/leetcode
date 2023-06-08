/*
@id         2236
@title      Root Equals Sum of Children
@tag        Binary Tree
@author     CryoVit
@date       2023/06/08
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int childSum(TreeNode cur) {
        int ans = cur.val;
        if (cur.left != null) {
            ans += childSum(cur.left);
        }
        if (cur.right != null) {
            ans += childSum(cur.right);
        }
        return ans;
    }
    public boolean checkTree(TreeNode root) {
        return root.val * 2 == childSum(root);
    }
}
