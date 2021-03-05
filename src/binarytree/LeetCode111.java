package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode111
 *
 * @author qiang.xu
 * @date 2021/03/03
 */
public class LeetCode111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return 1 + Math.min(minDepth(root.right), minDepth(root.left));
        }
    }


    public int minDepth2(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null) // Reach to leaf node
                    return depth;
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
            depth += 1; // Go to next level
        }
        return -1; // Unreachable
    }

}
