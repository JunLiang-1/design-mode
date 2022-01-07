package com.sinosoft.design.composite;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:46
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 组合模式
         * 将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等
         */
        Tree tree = new Tree("root");
        TreeNode treeNode1 = new TreeNode("children1");
        TreeNode treeNode2 = new TreeNode("children2");

        treeNode1.add(treeNode2);
        tree.treeNode.add(treeNode1);
    }
}
