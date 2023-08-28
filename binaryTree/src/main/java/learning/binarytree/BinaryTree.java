package learning.binarytree;


public class BinaryTree {

    public static void main(String[] args) {
       Tree tree = new Tree();
       tree.insertNode(6);
//       tree.insertNode(8);
       //tree.insertNode(5);
       // tree.searchNodeByValue(8);
       
      
       // отображение дерева:
       System.out.println(tree);
    }
}


class Node {
    private int value; // key of node
    private Node leftNode; // left child
    private Node rightNode; // right child
    
    public void printNode() { // output value
        System.out.println("Current node have value: " + value);
    }
    
    // getter and setter
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(final int value) {
        this.value = value;
    }
    
    public Node getLeftNode() {
        return this.leftNode;
    }
    
    public void setLeftNode(final Node leftNode) {
        this.leftNode = leftNode;
    }
    
    public Node getRightNode() {
        return this.rightNode;
    }
    
    public void setRightNode(final Node rightNode){
        this.rightNode = rightNode;
    }
    
    @Override
   public String toString() {
       return "Node{" +
               "value=" + value +
               ", leftChild=" + leftNode +
               ", rightChild=" + rightNode +
               '}';
   }
   
}

class Tree {
    private Node rootNode;
    
    public Tree() {
       rootNode = null;
    }
    
    public Node searchNodeByValue(int value) {
        Node currentNode = rootNode;
        while (currentNode.getValue() != value){
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeftNode();
            }
            else {
                currentNode = currentNode.getRightNode();
            }
            if (currentNode == null) {
                return null;
            }
        }
        return currentNode;
    }
    
    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        
        
        if (rootNode == null) {
            rootNode = newNode;
        }
        else {
            Node currentNode = rootNode;
            Node parentNode;
            
            while (true) {
                if (value == currentNode.getValue()) {
                    System.out.println("Node already exist");
                    return;
                }
                
                parentNode = currentNode;
                
                
                if (value < currentNode.getValue()) {
                    currentNode = currentNode.getRightNode();
                    if (currentNode == null) {
                        parentNode.setRightNode(rootNode);
                        return;
                    
                }
                else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeftNode();
                    if (currentNode == null) {
                        parentNode.setLeftNode(newNode);
                        return;
                    }
                }
                
                }
            }
        }
        
    }
   
}
