package Binary;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        // If the tree is empty (null root), return null
        if(root == null) return root;
        invert(root);
        return root;
    }

    public void invert(TreeNode node){
        if(node == null) return;

        // Swap left and right subtrees of the current node
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        // Recursively invert the left and right subtrees
        invert(node.left);
        invert(node.right);
    }

}