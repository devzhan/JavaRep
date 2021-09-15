package com.leetcode.dotry.tree;

/**
 * 二叉树各种遍历
 */
public class BinaryTree {

    /**
     * 递归西先序遍历
     * @param root
     */
    public  void preOrderRecursive(TreeNode root){
        if (root==null) return;
        System.out.println("根节点值为:"+root.value);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }


}
