package com.spartaglobal.sortmanager.model;

public class BubbleSortFactory extends SortFactory {

    @Override
    public Sort getInstance() {
        return new BubbleSort();
    }
}
