package utils;

public class TreeNode {
    public TreeNode left, right;
    public int val;

    public TreeNode() {

    }

    public TreeNode(char val) {
        this.val = val;
    }

    public static TreeNode build(char[] numbers) {
        return build(numbers, 0);
    }

     private static TreeNode build(char[] numbers, int idx) {
        if (idx >= numbers.length || numbers[idx] == 0) return null;
        TreeNode node = new TreeNode(numbers[idx]);
        node.left = build(numbers, idx * 2 + 1);
        node.right = build(numbers, idx * 2 + 2);

        return node;
    }

}
