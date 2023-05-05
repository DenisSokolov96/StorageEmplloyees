package ru.collection;

import ru.employee.Employee;
import ru.iterat.CustomIterator;
import ru.search.Search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Storage<T extends Employee> implements Iterable<T>{

    private final ArrayList<T> storage = new ArrayList<>(10);

    @SuppressWarnings("unchecked")
    public void add(T element){

        int indexSearch = Search.binarySearch((List<Employee>) getStorage(), element);

        if (indexSearch < 0)
            storage.add(-(indexSearch + 1), element);
        else
            storage.add(indexSearch, element);
    }

    public ArrayList<T> getStorage(){
        return this.storage;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<>(this.storage);
    }

}
