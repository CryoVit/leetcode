/*
@id         226
@title      Invert Binary Tree
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
    TreeNode invert(TreeNode cur) {
        return new TreeNode(
            cur.val,
            cur.right == null ? null : invert(cur.right),
            cur.left == null ? null : invert(cur.left)
        );
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        return invert(root);
    }
}
