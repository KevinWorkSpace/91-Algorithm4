public class SumNumbers {

    int ans = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return ans;
    }

    public void helper(TreeNode root, int tmp) {
        if (root == null) return;
        if (root.right == null && root.left == null) ans += tmp * 10 + root.val;
        helper(root.left, tmp * 10 + root.val);
        helper(root.right, tmp * 10 + root.val);
    }
}
