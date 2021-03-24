package Tree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value){
        if (value == data){
            return;
        }
        if (value <data){
            if (leftChild == null){
                leftChild = new TreeNode(value);
            }
            else{
                leftChild.insert(value);
            }
        }
        else{
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public TreeNode get(int value){
        if (data == value){
            return this;
        }
        if (value> data){
           if (rightChild != null){
               return rightChild.get(value);
           }
        }
        else{
            if (leftChild != null){
                return leftChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if (leftChild == null){
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public int max(){
        if (rightChild == null){
            return data;
        }
        else{
            return rightChild.max();
        }
    }

    public void traverseInOrder(){
        if (leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.println("Data is " + data);
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePostOrder(){

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }

}
