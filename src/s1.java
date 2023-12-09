// https://leetcode.cn/problems/minimum-absolute-difference-in-bst/description/

import utils.TreeNode;

public class s1 {

    TreeNode getMostRight(TreeNode node) {
        if (node.right == null) return node;
        return getMostRight(node.right);
    }
    TreeNode getMostLeft(TreeNode node) {
        if (node.left == null) return node;
        return getMostLeft(node.left);
    }

    int pre = -1;
    int ans = Integer.MAX_VALUE;

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }

}

