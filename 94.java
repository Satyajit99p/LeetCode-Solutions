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
import java.util.*;
class Solution {
    ArrayList<Integer> ar=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return ar;
        inorderTraversal(root.left);
        
        ar.add(root.val);
        
        inorderTraversal(root.right);
        
        return ar;
    }
}