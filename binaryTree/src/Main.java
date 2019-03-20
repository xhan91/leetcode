public class Main {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode('A');
        TreeNode n2 = new TreeNode('B');
        TreeNode n3 = new TreeNode('C');
        TreeNode n4 = new TreeNode('D');
        TreeNode n5 = new TreeNode('E');
        TreeNode n6 = new TreeNode('F');
        TreeNode n7 = new TreeNode('G');
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        TreeLooper treeLooper = new TreeLooper();
        System.out.println("level order:");
        treeLooper.levelOrder(n1);
        System.out.println();
        System.out.println("pre order:");
        treeLooper.preOrder(n1);
        System.out.println();
        System.out.println("in order:");
        treeLooper.inOrder(n1);
        System.out.println();
        System.out.println("post order:");
        treeLooper.postOrder(n1);
    }
}
