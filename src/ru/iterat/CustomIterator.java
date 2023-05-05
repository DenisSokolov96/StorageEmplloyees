package ru.iterat;

import java.util.Iterator;
import java.util.List;

public class CustomIterator<T> implements Iterator<T> {

    List<T> storage;
    private int index = 0;
    public CustomIterator(List<T> storage) {
        this.storage = storage;
    }

    @Override
    public boolean hasNext() {
        return index < storage.size();
    }

    @Override
    public T next() {
        if (index >= this.storage.size())
            throw new NullPointerException("Object is null.");
        return storage.get(index++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
