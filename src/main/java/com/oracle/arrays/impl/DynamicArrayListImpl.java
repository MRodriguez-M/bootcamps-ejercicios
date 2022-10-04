package com.oracle.arrays.impl;

import com.oracle.arrays.DynamicArrayList;

public class DynamicArrayListImpl implements DynamicArrayList {
    private int size = 10;
    private int[] arr = new int[size];
    private int idx = 0;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public void insert(int element) {
        if(idx >= size) {
            resize();
        }

        arr[idx] = element;
        idx++;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int get(int index) {
        int elementVal = arr[index];
        
        return elementVal;
    }

    @Override
    public void resize() {
        int[] temp = new int[idx+1];
        for(int i = 0; i < arr.length; i++) {
          temp[i] = arr[i];
        }
        
        arr = temp;
    }

    @Override
    public void resize(int newSize) {
        
    }

    @Override
    public int length() {
        return 0;
    }
}
