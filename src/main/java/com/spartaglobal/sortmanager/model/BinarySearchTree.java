package com.spartaglobal.sortmanager.model;


import com.spartaglobal.sortmanager.controller.SortManager;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTree implements Sort {

    private static ArrayList<Integer> treeToArrayList(Node root, ArrayList<Integer> list) {
        if (root == null)
            return list;
        treeToArrayList(root.left, list);
        list.add(root.data);
        treeToArrayList(root.right, list);
        return list;
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        }
        if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Data structure to store a Binary Search Tree node
    static class Node {
        int data;
        Node left = null, right = null;

        Node(int data) {
            this.data = data;
        }
    }

    @Override
    public int[] sort(int[] intArray) {

        Node root = null;
        for (int i : intArray){
            root = insert(root, i);
        }
        ArrayList<Integer> integers = new ArrayList<>();

        treeToArrayList(root, integers);

        int[] ints = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++){
            ints[i] = integers.get(i);
        }
        return ints;
    }
}


