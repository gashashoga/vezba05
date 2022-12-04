package org.example;

import java.util.ArrayList;

public class NonIncreasingIntSorter extends AbstractIntSorter{

    protected NonIncreasingIntSorter(ArrayList<Integer> listaCelihBrojeva) {
        super(listaCelihBrojeva);
    }

    @Override
    protected boolean shouldSwap(int x, int y) {
        return x > y;
    }
}
