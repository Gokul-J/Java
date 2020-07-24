public class TreeNode {

    private int data;
    private TreeNode leftchild;
    private TreeNode rightchild;

    //Constructor...
    public TreeNode(int data){
        this.data=data;
    }

    //Insertion...
    public void insert(int value){
        if(value==data){
            return;
        }
        else if(value<data){
            if(leftchild==null){
                leftchild=new TreeNode(value);
            }
            else{
                leftchild.insert(value);
            }
        }
        else{
            if(rightchild==null){
                rightchild=new TreeNode(value);
            }
            else{
                rightchild.insert(value);
            }
        }
    }

    //Traversal...
    public void inorder(){
        //Inorder : Left-Root-Right
        if(leftchild!=null){
            leftchild.inorder();
        }
        System.out.print(data+" ");
        if(rightchild!=null){
            rightchild.inorder();
        }
    }

    public void preorder(){
        //Preorder : Root-Left-Right
        System.out.print(data+" ");
        if(leftchild!=null){
            leftchild.preorder();
        }
        if(rightchild!=null){
            rightchild.preorder();
        }
    }

    public void postorder(){
        //Postorder : Left-Right-Root
        if(leftchild!=null){
            leftchild.postorder();
        }
        if(rightchild!=null){
            rightchild.postorder();
        }
        System.out.print(data+" ");
    }

    //Get...
    public TreeNode get(int value){
        if(value==data){
            return this;
        }
        if(value<data){
            if(leftchild!=null){
                return leftchild.get(value);
            }
        }
        else{
            if(rightchild!=null){
                return rightchild.get(value);
            }
        }
        return null;
    }

    //Min...
    public int min(){
        if(leftchild==null){
            return data;
        }
        return leftchild.min();
    }

    public int max(){
        if(rightchild==null){
            return data;
        }
        return rightchild.max();
    }

    //Setters and Getters...
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftchild() {
        return leftchild;
    }

    public void setLeftchild(TreeNode leftchild) {
        this.leftchild = leftchild;
    }

    public TreeNode getRightchild() {
        return rightchild;
    }

    public void setRightchild(TreeNode rightchild) {
        this.rightchild = rightchild;
    }

    @Override
    public String toString() {
        return "TreeNode [data=" + data + "]";
    }
    
}