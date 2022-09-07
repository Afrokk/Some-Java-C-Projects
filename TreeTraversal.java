public class TreeTraversal {

    public static void preOrder(int[] treeArr, int i) {
        if (i < treeArr.length) {
            System.out.print(treeArr[i] + " ");
            preOrder(treeArr, 2 * i + 1);
            preOrder(treeArr, 2 * i + 2);
        }
    }

    public static void inOrder(int[] treeArr, int i) {
        if (i < treeArr.length) {
            inOrder(treeArr, 2 * i + 1);
            System.out.print(treeArr[i] + " ");
            inOrder(treeArr, 2 * i + 2);
        }
    }

    public static void postOrder(int[] treeArr, int i) {
        if (i < treeArr.length) {
            postOrder(treeArr, 2 * i + 1);
            postOrder(treeArr, 2 * i + 2);
            System.out.print(treeArr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] binarytree = new int[10];
        for (int i = 0; i < binarytree.length; i++) {
            binarytree[i] = i;
        }
        System.out.println("Traversing in PreOrder: ");
        preOrder(binarytree, 0);
        System.out.println("\nTraversing in InOrder: ");
        inOrder(binarytree, 0);
        System.out.println("\nTraversing in PostOrder: ");
        postOrder(binarytree, 0);
    }
}