package Trees;

class BinaryTree {

    // Node class
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Root of the tree
    private Node root;

    /* ---------------- INSERT ---------------- */
    // Level order insertion (Binary Tree, not BST)
    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }

    /* ---------------- INORDER ---------------- */
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    /* ---------------- PREORDER ---------------- */
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    /* ---------------- POSTORDER ---------------- */
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    /* ---------------- LEVEL ORDER ---------------- */
    public void levelOrder() {
        if (root == null) return;

        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
        System.out.println();
    }

    /* ---------------- SEARCH ---------------- */
    public boolean search(int key) {
        if (root == null) return false;

        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.data == key) return true;

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
        return false;
    }

    /* ---------------- HEIGHT ---------------- */
    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return -1;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    /* ---------------- SIZE ---------------- */
    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;

        int leftSize = size(node.left);
        int rightSize = size(node.right);

        return 1 + leftSize + rightSize;
    }

    /* ---------------- SUM ---------------- */
    public int sum() {
        return sum(root);
    }

    private int sum(Node node) {
        if (node == null) return 0;

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        return node.data + leftSum + rightSum;
    }

    /* ---------------- PRODUCT ---------------- */
    public int product() {
        return product(root);
    }

    private int product(Node node) {
        if (node == null) return 1;

        int leftProduct = product(node.left);
        int rightProduct = product(node.right);

        return node.data * leftProduct * rightProduct;
    }

}
