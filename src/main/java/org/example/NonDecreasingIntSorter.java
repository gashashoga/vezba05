package org.example;

import java.util.ArrayList;

public class NonDecreasingIntSorter extends AbstractIntSorter{

    protected NonDecreasingIntSorter(ArrayList<Integer> listaCelihBrojeva) {
        super(listaCelihBrojeva);
    }

    @Override
    protected boolean shouldSwap(int x, int y) {
        return y < x;
    }
}
