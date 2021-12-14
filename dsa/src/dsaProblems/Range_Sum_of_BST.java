package dsaProblems;

public class Range_Sum_of_BST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {

        getSum(root,low,high);


        return  sum;

    }

    public  void getSum(TreeNode root, int low, int high) {
        if (root==null)
            return;
        getSum(root.left,low,high);


        if (root.val>=low && root.val<=high) {

            sum=sum+root.val;
            System.out.println(root.val+" Sum =: "+sum);


        }
        getSum(root.right,low,high);

        return;

    }

}
