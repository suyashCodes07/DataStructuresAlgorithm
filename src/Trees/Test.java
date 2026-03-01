package Trees;

public class Test {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // ---------- INSERT ----------
        insertNodes(tree);

        // ---------- TRAVERSALS ----------
        printTraversals(tree);

        // ---------- SEARCH ----------
        testSearch(tree, 30);
        testSearch(tree, 99);

        // ---------- HEIGHT ----------
        System.out.println("Height of tree : " + tree.height());

        // ---------- MATH OPERATIONS ----------
        printSum(tree);
        printProduct(tree);
        printSize(tree);
    }

    private static void insertNodes(BinaryTree tree) {
        int[] values = {10, 20, 30, 40, 50};

        for (int val : values) {
            tree.insert(val);
        }
    }

    private static void printTraversals(BinaryTree tree) {
        System.out.print("Inorder Traversal   : ");
        tree.inorder();

        System.out.print("Preorder Traversal : ");
        tree.preorder();

        System.out.print("Postorder Traversal: ");
        tree.postorder();

        System.out.print("Level Order        : ");
        tree.levelOrder();
    }

    private static void testSearch(BinaryTree tree, int key) {
        System.out.println("Search " + key + " : " +
                (tree.search(key) ? "Found" : "Not Found"));
    }

    // --- Added methods below ---

    private static void printSum(BinaryTree tree) {
        System.out.println("Sum of nodes   : " + tree.sum());
    }

    private static void printProduct(BinaryTree tree) {
        System.out.println("Product of nodes: " + tree.product());
    }

    private static void printSize(BinaryTree tree) {
        System.out.println("Size of tree    : " + tree.size());
    }
}