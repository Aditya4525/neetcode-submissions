/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] preIndex= new int[1];
        Map<Integer,Integer> inIndexMap=new HashMap<>();
        int i=0;
        for(int ele:inorder){
            inIndexMap.put(ele,i);
            i++;
        }
        return dfs(preorder,inIndexMap,preIndex,0,inorder.length-1);
        
    }

    public TreeNode dfs(int[] preorder,Map<Integer,Integer> inIndexMap,int[] preIndex,int l,int r){
        if(l>r){
            return null;
        }
        TreeNode node =new TreeNode(preorder[preIndex[0]++]);
        int mid = inIndexMap.get(node.val);
        node.left=dfs(preorder,inIndexMap,preIndex,l,mid-1);
        node.right=dfs(preorder,inIndexMap,preIndex,mid+1,r);
        return node;
    }
}
