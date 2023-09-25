package org.fvreeed;

import java.util.ArrayList;

public class GreenArray extends ArrayList<Integer> {

    public GreenArray(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public boolean add(Integer integer) {
        return super.add(integer);
    }

    @Override
    public void add(int index, Integer element) throws OverflowException {
        if (index > 9) {
            throw new OverflowException();
        }
        super.add(index, element);
    }
}
