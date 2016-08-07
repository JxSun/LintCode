/**
 * Runtime: 11ms
 * This solution beats 12.89% of Java submissions.
 */
 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val) {
            return (root.val > q.val) ? lowestCommonAncestor(root.left, p, q) : root;
        } else if (root.val < p.val) {
            return (root.val < q.val) ? lowestCommonAncestor(root.right, p, q) : root;
        } else {
            return root; 
        }
    }
}