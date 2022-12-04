package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractIntSorter {
    private final ArrayList<Integer> listaCelihBrojeva;

    protected AbstractIntSorter(ArrayList<Integer> listaCelihBrojeva) {
        this.listaCelihBrojeva = listaCelihBrojeva;
    }

    public final List<Integer> getSorted(){
        for(int i = 0; i < listaCelihBrojeva.size() - 1;i++)
        {
            for(int j = i+1; j< listaCelihBrojeva.size();j++)
            {
                if(shouldSwap(listaCelihBrojeva.get(i),listaCelihBrojeva.get(j)))
                {
                    int prom = listaCelihBrojeva.get(i);
                    listaCelihBrojeva.set(i,listaCelihBrojeva.get(j));
                    listaCelihBrojeva.set(j,prom);
                }
            }
        }
        return listaCelihBrojeva;
    }
    protected abstract boolean shouldSwap(int x,int y);
}
