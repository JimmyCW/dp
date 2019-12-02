package com.wx.iterator;

public class MyList implements Collection {
    private String[] list = {};

    @Override
    public void add(String s) {
        String[] listNew = new String[list.length + 1];
        System.arraycopy(list, 0, listNew, 0, list.length);
        listNew[listNew.length - 1] = s;
        list = listNew;
    }


    @Override
    public String get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return list.length;
    }

    public static void main(String[] args) {
        Collection collection = new MyList();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        collection.add("f");

        System.out.println(collection.get(1));
        Iterator iterator = new Iterator(collection);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
