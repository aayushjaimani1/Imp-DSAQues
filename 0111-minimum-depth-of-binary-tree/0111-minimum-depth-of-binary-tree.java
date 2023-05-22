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
    public int minDepth(TreeNode root) {
        
        // base case: if root is null, return 0
        if(root == null){
            return 0;
        }

        // if root has no children, return 1
        if(root.left == null && root.right == null){
            return 1;
        }

        // if root has no left child, return the min depth of the right subtree + 1
        if(root.left == null){
            return minDepth(root.right) + 1;
        }

        // if root has no right child, return the min depth of the left subtree + 1
        if(root.right == null){
            return minDepth(root.left) + 1;
        }
        
        // if root has both left and right children, return the min depth of the left and right subtrees + 1
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}