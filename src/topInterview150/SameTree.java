package topInterview150;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //using recursive method to check current node the whole tree

        if (p == null && q == null){ // if both are null
            return true;
        }
        else if(p == null || q == null){ // if only one is null (previous statement covers both null case)
            return false;
        }
        else if(p.val != q.val){ //if current node values do not match
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
