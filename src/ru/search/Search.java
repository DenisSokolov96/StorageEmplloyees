package ru.search;

import java.util.List;

public class Search {

    public static <T extends Comparable<T>>int binarySearch(List<T> storage, T elementFind){
        if (storage.size() == 0) return -1;
        return binary(storage, elementFind, 0, storage.size() - 1);
    }

    private static <T extends Comparable<T>>int binary(List<T> storage, T elementFind, int left, int right) {

        int m = left + (right - left) / 2;
        int valueCmpM = elementFind.compareTo(storage.get(m));

        if (valueCmpM == 0) return m;
        if (left == right)
            return (valueCmpM < 0) ? -(m + 1) : -(m + 2);

        if (valueCmpM > 0)
            return binary(storage, elementFind, m + 1, right);
        else
            return binary(storage, elementFind, left, m);
    }
}
