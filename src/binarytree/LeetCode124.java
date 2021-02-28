package binarytree;

/**
 * LeetCode124
 *
 * @author qiang.xu
 * @date 2021/02/21
 */
public class LeetCode124 {

    private int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        oneSideMax(root);
        return ans;
    }

    private int oneSideMax(TreeNode root) {
        if (root == null) return 0;
        int left = Math.max(0, oneSideMax(root.left));
        int right = Math.max(0, oneSideMax(root.right));
        ans = Math.max(ans, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
