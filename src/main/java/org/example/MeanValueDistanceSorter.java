package org.example;

import java.util.ArrayList;

public class MeanValueDistanceSorter extends AbstractIntSorter{
    protected MeanValueDistanceSorter(ArrayList<Integer> listaCelihBrojeva) {
        super(listaCelihBrojeva);
    }

    @Override
    protected boolean shouldSwap(int x, int y) {
        return false;
    }
}
