package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTREE= new BinaryTree(10);
        bTREE.insertNode(5);
        bTREE.insertNode(12);
        bTREE.insertNode(11);
        bTREE.insertNode(13);
        bTREE.insertNode(15);
        bTREE.insertNode(7);
        bTREE.insertNode(2);
        System.out.println("result searching  12 :"+bTREE.searchNode(12));

        System.out.println("Preorder traversal : ");
        bTREE.preOrderT();
        System.out.println("Inorder traversal : ");
        bTREE.inOrderT();
        System.out.println("Postorder traversal : ");
        bTREE.postOrderT();
    }
}
