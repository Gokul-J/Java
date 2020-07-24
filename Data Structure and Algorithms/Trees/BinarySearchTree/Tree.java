public class Tree{

    private TreeNode root;

    //Insertion...
    public void insert(int value){
        if(root==null){
            root=new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }

    //Deletion...
    public void delete(int value){
        root=delete(root,value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if(subtreeRoot==null){
            return subtreeRoot;
        }

        if(value<subtreeRoot.getData()){
            subtreeRoot.setLeftchild(delete(subtreeRoot.getLeftchild(), value));
        }
        else if(value>subtreeRoot.getData()){
            subtreeRoot.setRightchild(delete(subtreeRoot.getRightchild(),value));
        }
        else{
            //case 1 & 2 : Delete a node with zero or one child...
            if(subtreeRoot.getLeftchild()==null){
                return subtreeRoot.getRightchild();
            }
            else if(subtreeRoot.getRightchild()==null){
                return subtreeRoot.getLeftchild();
            }

            //case 3 : Delete a node with two children...
            //Replace the value in subtreeRoot with min value in rightSubTree...
            subtreeRoot.setData(subtreeRoot.getRightchild().min());

            //Delete the node that has the min value in the rightSubTree...
            subtreeRoot.setRightchild(delete(subtreeRoot.getRightchild(),subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    //Traversal...
    public void inorder(){
        if(root!=null){
            root.inorder();
        }
    }

    public void preorder(){
        if(root!=null){
            root.preorder();
        }
    }

    public void postorder(){
        if(root!=null){
            root.postorder();
        }
    }

    //Get...
    public TreeNode get(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }

    //Min...
    public int min(){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    //Max...
    public int max(){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return root.max();
    }
}