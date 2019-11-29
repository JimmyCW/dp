package com.wx.composite;

import java.util.Vector;

public class TreeNode {
    private Vector<TreeNode> treeNodes = new Vector<>();

    public void addNode(TreeNode treeNode) {
        treeNodes.add(treeNode);
    }

    public boolean remove(TreeNode treeNode) {
        return treeNodes.remove(treeNode);
    }

    class Node {
        private String val;
        Node left;
        Node right;
    }

    public static void main(String[] args) {

    }
}
