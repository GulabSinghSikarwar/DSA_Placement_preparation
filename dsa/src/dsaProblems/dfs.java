package dsaProblems;


   class TreeNode {
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


public class dfs {
    static int  ans=0;
    public  static  int  dfs(TreeNode root){

        if (root==null)
            return 0;
     int left=dfs(root.left);
     int right=dfs(root.right);

     ans=+ Math.abs(left-right);
     return root.val+ans;





    }
    public static void main(String[] args) {

    }
}
