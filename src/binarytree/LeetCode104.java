package binarytree;

/**
 * LeetCode104
 *
 * @author qiang.xu
 * @date 2021/02/28
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
