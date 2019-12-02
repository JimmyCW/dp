package com.wx.iterator;

public class Iterator {

    private Collection collection;

    private int pointer = -1;

    public Iterator(Collection collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return pointer < collection.size() - 1;
    }

    public String next() {
        pointer++;
        return collection.get(pointer);
    }

}
