package com.company;

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
        if (index < 16) {
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

        for (int i = j; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        index --;
    }

    public int size() {
        return index;
    }

    public Object get(int j){
        return array[j];
    }

}
