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
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        Stack<TreeNode> asc = new Stack<>();
        Stack<TreeNode> desc = new Stack<>();
        TreeNode i=root;
        TreeNode j=root;
        while(i!=null){
            asc.push(i);
            i=i.left;
        }
        while(j!=null){
            desc.push(j);
            j=j.right;
        }
        i=getsmall(asc);
        j=getbig(desc);
        while(i!=null && j!=null && i!=j && i.val<j.val){
            int sum=i.val+j.val;
            if(sum==k){
                return true;
            }
            else if(sum>k){
                j=getbig(desc);
            }
            else{
                i=getsmall(asc);
            }
        }
        return false;
    }
    private TreeNode getsmall(Stack<TreeNode> asc){
        if(asc.isEmpty()){
            return null;
        }
        TreeNode small=asc.pop();
        TreeNode rightchild=small.right;
        while(rightchild!=null){
            asc.push(rightchild);
            rightchild=rightchild.left;
        }
        return small;
    }
    private TreeNode getbig(Stack<TreeNode> desc){
        if(desc.isEmpty()){
            return null;
        }
        TreeNode big=desc.pop();
        TreeNode leftchild=big.left;
        while(leftchild!=null){
            desc.push(leftchild);
            leftchild=leftchild.right;
        }
        return big;
    }
}