
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left = Math.max(0, maxGain(root.left));
        int right = Math.max(0, maxGain(root.right));

        int currentSum = root.val + left + right;

        // Update global maximum
        maxSum = Math.max(maxSum, currentSum);
        return root.val + Math.max(left, right);
    }
}
