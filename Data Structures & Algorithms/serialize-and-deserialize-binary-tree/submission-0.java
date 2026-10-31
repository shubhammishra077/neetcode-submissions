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


public class Codec {

    // Serialize: Binary Tree -> String
    public String serialize(TreeNode root) {

        if (root == null) return "";

        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            if (node == null) {
                result.append("null,");
                continue;
            }

            result.append(node.val).append(",");

            queue.offer(node.left);
            queue.offer(node.right);
        }

        return result.toString();
    }

    // Deserialize: String -> Binary Tree
    public TreeNode deserialize(String data) {

        if (data == null || data.isEmpty()) return null;

        String[] values = data.split(",");

        TreeNode root = new TreeNode(
            Integer.parseInt(values[0])
        );

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            // Left child
            if (!values[i].equals("null")) {

                TreeNode left = new TreeNode(
                    Integer.parseInt(values[i])
                );

                node.left = left;
                queue.offer(left);
            }

            i++;

            // Right child
            if (!values[i].equals("null")) {

                TreeNode right = new TreeNode(
                    Integer.parseInt(values[i])
                );

                node.right = right;
                queue.offer(right);
            }

            i++;
        }

        return root;
    }
}

