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
    
    int res = Integer.MIN_VALUE;
    public int diameter(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int l = diameter(root.left);
        int r = diameter(root.right);
        
        int temp = Math.max(l,r)+1 ;
        res = Math.max(res,l+r+1);
        return temp ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter(root);
        return res-1;
    }
}