package com.spartaglobal.sortmanager.model;

public class BinarySearchTreeFactory extends SortFactory{
    @Override
    public Sort getInstance() {
        return new BinarySearchTree();
    }
}
