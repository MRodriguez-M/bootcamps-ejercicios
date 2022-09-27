package com.oracle.arrays.impl;

import com.oracle.arrays.Unidimensional;

public class UnidimensionalImpl implements Unidimensional {
    @Override
    public void ordenamiento(int[] arr) {
        int tempNum = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    tempNum = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempNum;
                }
            }
        }
    }

    @Override
    public int[] ordenamientoReversa(int[] arr) {
        int tempNum = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    tempNum = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempNum;
                }
            }
        }
        return arr;
    }
}
