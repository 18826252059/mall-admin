package org.sandwich.litemall.core;
import java.util.LinkedList;

public class ChildTest extends Person {

    public static TreeNode reConstruct(LinkedList<Integer> pre, LinkedList<Integer> tree) {
        if(pre.size() <= 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre.remove());
        LinkedList<Integer> leftTree = new LinkedList<>();
        while(true) {
            int temp = tree.remove();
            if(temp == treeNode.val) {
                break;
            } else {
                leftTree.add(temp);
            }
        }
        LinkedList<Integer> rightTree = new LinkedList<>();
        rightTree = tree;

        if(leftTree.size() > 0) {
            treeNode.left = reConstruct(pre,leftTree);
        }
        if(rightTree.size() > 0) {
            treeNode.right = reConstruct(pre,rightTree);
        }
        return treeNode;
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        LinkedList<Integer> preQueue = new LinkedList<>();
        LinkedList<Integer> tree = new LinkedList<>();
        for(int i = 0; i < pre.length; i++) {
            preQueue.add(pre[i]);
            tree.add(pre[i]);
        }
        TreeNode newTreeNode = reConstruct(preQueue, tree);
        return newTreeNode;
    }

    public static void main(String[] args) {
        int [] pre = {1,2,4,7,3,5,6,8};
        int [] in = {4,7,2,1,5,3,8,6};
        TreeNode newTreeNode = reConstructBinaryTree(pre, in);
        System.out.println("jjj");
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
