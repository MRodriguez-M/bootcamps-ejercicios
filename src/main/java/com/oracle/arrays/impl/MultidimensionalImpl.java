package com.oracle.arrays.impl;

import com.oracle.arrays.Multidimensional;
import com.oracle.arrays.model.Posicion;

public class MultidimensionalImpl implements Multidimensional {
    @Override
    public Posicion getPosition(String[][] datos, String dato) {
        Posicion indices = null;
        
        for(int i = 0; i < datos.length; i++) {
            for(int j = 0; j < datos[i].length; j++) {
                if(datos[i][j].equals(dato)) {
                    indices = new Posicion(i, j);
                }
            }
        }
        
        return indices;
    }

    @Override
    public String getData(String[][] datos, Posicion posicion) {
        return null;
    }
}
