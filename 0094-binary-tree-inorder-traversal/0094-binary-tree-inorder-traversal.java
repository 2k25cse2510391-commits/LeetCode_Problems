/*
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
    static List<Integer> ls = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        ls.clear();
        traversal(root);
        return ls;
    }

    public static void traversal(TreeNode node){
        if(node==null){
            return;
        }

        traversal(node.left);
        ls.add(node.val);
        traversal(node.right);
    }
}