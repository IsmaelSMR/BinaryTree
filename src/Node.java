public class Node {

    int data;
    Node left, right;

    public Node (int data){
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public void  setData(Object data){
        this.data = (int) data;
    }

    public Node getLeft(){
        return left;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public Node getRight(){
        return right;
    }

    public void setRight(Node right){
        this.right = right;
    }

}
