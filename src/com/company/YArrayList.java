package com.company;

import java.util.List;

public class YArrayList<T> {
    private Object[] array = new Object[16];
    private int index = 0;

    public String toString() {
        String s = "";
        for (int i = 0; i < index; i++) {
            s += array[i] + ", ";
        }
        return s;
    }

    public void add(T object) {
        if (index < array.length) {
            array[index] = object;
            index++;
        } else {
            Object[] array2 = new Object[(array.length * 3) / 2 + 1];
            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }
            array = array2;
            array[index] = object;
            index++;
        }
    }

    public void delete(int j) {
        array[j] = null;

        for (int i = j; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    public int size() {
        return index;
    }

    public T get(int j) {
        return (T) array[j];
    }

    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(T o) {
        if (o == null) {
            for (int i = 0; i < array.length; i++)
                if (array[i] == null)
                    return i;
        } else {
            for (int i = 0; i < array.length; i++)
                if (o.equals(array[i]))
                    return i;
        }
        return -1;
    }

    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (index < array.length) {
                array[index] = list.get(i);
                index++;
            } else {
                Object[] array2 = new Object[(array.length * 3) / 2 + 1];
                for (int j = 0; j < index; j++) {
                    array2[j] = array[j];
                }
                array = array2;
                array[index] = list.get(i);
                index++;
            }
        }
    }
}
