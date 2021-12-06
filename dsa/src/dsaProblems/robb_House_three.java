package dsaProblems;

public class robb_House_three {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

//  Reacursive solution
  /*  public static  int rob(TreeNode root) {
        if (root==null )
            return  0;

        int val=0;

        if (root.left!=null)
            val+=rob(root.left.left)+rob(root.left.right);
        if(root.right!=null)
            val+=rob(root.right.left)+rob(root.right.right);

        return Math.max(val+ root.val,rob(root.left)+rob(root.right));





    }*/
//    opimal Approach
public static  int rob(TreeNode root) {
int robresult [] =robDP(root);
    return Math.max(robresult[0],robresult[1]);

}

    private static int[] robDP(TreeNode root) {
    if (root==null)
        return  new int [2];

    int left [] =robDP(root.left);
    int right []=robDP(root.right);
    int RobRoot [] =new int [2];

    RobRoot[0]= Math.max(left[0],left[1])+Math.max(right[0],right[1]);
    RobRoot[1]= root.val+left[0]+right[0];
    return  RobRoot;



    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

//        root.left.left=new TreeNode(null);
        root.left.right=new TreeNode(3);

//        root.right.left=new TreeNode(2);
        root.right.right=new TreeNode(1);

        System.out.println("Max robbed value :"+rob(root));





    }
}
