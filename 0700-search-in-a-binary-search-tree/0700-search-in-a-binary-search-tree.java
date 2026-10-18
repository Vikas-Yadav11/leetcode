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
    TreeNode ans=null;
    public TreeNode searchBST(TreeNode root, int val){
    fun(root,val);
    return ans;
    }
    void fun(TreeNode node,int val){
        if(node==null){
            return;
        }
        if(node.val==val){
            ans=node;
            return;
        }
        if(node.val>val){
            fun(node.left,val);
        }else{
            fun(node.right,val);
        }
        return;
    }
}