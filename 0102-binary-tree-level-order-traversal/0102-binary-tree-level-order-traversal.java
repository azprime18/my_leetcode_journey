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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        int h = levels(root);

        for(int i = 0; i < h; i++) {
            List<Integer> curr = new ArrayList<>();
            Kthlevel(root, i, 0, curr);
            ans.add(curr);
        }
        return ans;
    }

    static int levels(TreeNode root) {
        if(root == null) return 0;

        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    static void Kthlevel(TreeNode root, int K, int level,List<Integer> curr) {
        if(root == null) return;
        if(level == K) {
            curr.add(root.val);
            return;
        }
        Kthlevel(root.left, K, level + 1, curr);
        Kthlevel(root.right, K, level + 1, curr);
    }
}