// Binary Tree Postorder Traversal

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        printPost(root , list);
        return list;
    }
    public void printPost(TreeNode root , List<Integer> result){
        if(root == null) return;
        printPost(root.left,result);
        printPost(root.right,result);
        result.add(root.val);
    }
}
