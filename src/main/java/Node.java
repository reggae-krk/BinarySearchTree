public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void removeChild(Node child) {
        if (this.left == child) {
            this.left = null;
        }
        else if (this.right == child) {
            this.right = null;
        }
        else {
            throw new IllegalArgumentException("Cannot remove non existing child");
        }
    }
}