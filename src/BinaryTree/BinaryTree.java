package BinaryTree;

public class BinaryTree {
    private Node root;

    public BinaryTree(int rootValue) {
        root = new Node(rootValue, null, null);
    }

    private void insert(Node newNode, Node rnode) {
        if (newNode.getValue() > rnode.getValue()) {
            if (rnode.getRight() == null)
                rnode.setRight(newNode);
            else
                insert(newNode, rnode.getRight());
        }
        else if (newNode.getValue() < rnode.getValue()) {
                if (rnode.getLeft()==null)
                    rnode.setLeft(newNode);
                else
                    insert(newNode,rnode.getLeft());
        }

        else System.out.println("Cant add duplicated values");
    }



public void insertNode(int value){
        Node newNode =new Node(value,null,null);
        insert(newNode,root);
}

private boolean search(int value, Node rnode){
    if (rnode==null)return false;
    if (value> rnode.getValue())
        return search(value,rnode.getRight());
    else if (value < rnode.getValue())
        return search(value,rnode.getLeft());
    else return true;

}
public boolean searchNode(int value){
        return search(value,root);
}


private void preOrder(Node rnode){
    if (rnode==null)return;
    System.out.print(rnode.getValue()+" ");
    preOrder(rnode.getLeft());
    preOrder(rnode.getRight());
}
public void preOrderT(){
        preOrder(root);
    System.out.println();
}
/// /////////
private void inOrder(Node rnode){
        if (rnode==null)return;
        inOrder(rnode.getLeft());
        System.out.print(rnode.getValue()+" ");
        inOrder(rnode.getRight());
    }
    public void inOrderT(){
        inOrder(root);
        System.out.println();
    }
////////////////

private void postOrder(Node rnode){
        if (rnode==null)return;
        postOrder(rnode.getLeft());
        postOrder(rnode.getRight());
        System.out.print(rnode.getValue()+" ");
    }
    public void postOrderT(){
        postOrder(root);
        System.out.println();
    }
















class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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
    }


}