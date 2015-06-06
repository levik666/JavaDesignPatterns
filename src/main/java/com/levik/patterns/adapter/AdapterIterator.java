package com.levik.patterns.adapter;

import java.util.Iterator;
import java.util.ListIterator;

public class AdapterIterator<E> implements ListIterator<E>{

    private Iterator<E> iterator;

    public AdapterIterator(Iterator<E> iterator) {
        this.iterator = iterator;
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public E next() {
        return iterator.next();
    }

    public void remove() {
        iterator.remove();
    }

    public boolean hasPrevious() {
        throw new UnsupportedOperationException();
    }

    public E previous() {
        throw new UnsupportedOperationException();
    }

    public int nextIndex() {
        throw new UnsupportedOperationException();
    }

    public int previousIndex() {
        throw new UnsupportedOperationException();
    }

    public void set(E e) {
        throw new UnsupportedOperationException();
    }

    public void add(E e) {
        throw new UnsupportedOperationException();
    }
}
