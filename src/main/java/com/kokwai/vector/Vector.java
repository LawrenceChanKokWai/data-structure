package com.kokwai.vector;

import java.util.Arrays;

public class Vector {

    private static int INITIAL_VALUE=2;

    private int capacity;
    private int size;
    private int[] data;

    private void reSize(){
        int newData = data.length * 2;
        data = Arrays.copyOf(data, newData);
    }

    public Vector() {
        data = new int[INITIAL_VALUE];
    }

    public int getCapacity() {
        return data.length;
    }

    public int getSize() {
        return size;
    }

    public void addElement(int element){
        if(size == getCapacity() / 2 ){
            reSize();
        }
        data[size++] = element;
    }

    public int at(int index){
        return data[index];
    }

    public int removeElement(int index){
        int element = data[index];
        for(int i=index; i<size-1; i++){
            data[i] = data[i+1];
        }
        size--;
        return element;
    }
}
