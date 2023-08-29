package learning.binarytree;


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
