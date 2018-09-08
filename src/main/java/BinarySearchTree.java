public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int[] array) {

        int indexRootData = array.length/2;
        int rootData = array[indexRootData];
        this.root = new Node(rootData);
        createBinaryTreeFromArray(array, 0, indexRootData);
        createBinaryTreeFromArray(array, indexRootData + 1, array.length);
    }

    private void createBinaryTreeFromArray(int[] array, int startIndex, int endIndex) {

        Node tempRoot = this.root;

        for (int i = startIndex; i < endIndex; i++) {

            if (array[i] < tempRoot.getData()) {
                tempRoot.setLeft(new Node(array[i]));
                tempRoot = tempRoot.getLeft();
            }
            else {
                tempRoot.setRight(new Node(array[i]));
                tempRoot = tempRoot.getRight();
            }
        }
    }
}
