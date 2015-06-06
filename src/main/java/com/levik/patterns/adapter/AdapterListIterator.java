package com.levik.patterns.adapter;

import java.util.Iterator;
import java.util.ListIterator;

public class AdapterListIterator<E> implements Iterator<E>{

    private ListIterator<E> listIterator;

    public AdapterListIterator(ListIterator<E> listIterator) {
        this.listIterator = listIterator;
    }

    public boolean hasNext() {
        return listIterator.hasNext();
    }

    public E next() {
        return listIterator.next();
    }

    public void remove() {
        listIterator.remove();
    }
}
