import java.util.LinkedList;
import java.util.Queue;

public class TreeLooper {

    public void levelOrder(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            TreeNode current = q.poll();
            print(current);
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }

    public void preOrder(TreeNode node) {
        if (node == null) return;
        print(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        print(node);
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        print(node);
    }
    
    private void print(TreeNode node) {
        System.out.print(node.val);
        System.out.print(" ");
    }
}
