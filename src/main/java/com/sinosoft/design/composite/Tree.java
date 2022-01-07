package com.sinosoft.design.composite;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:46
 * @version: 1.0
 */
public class Tree {
    TreeNode treeNode = null;

    public Tree(String name) {
        this.treeNode = new TreeNode(name);
    }
}
