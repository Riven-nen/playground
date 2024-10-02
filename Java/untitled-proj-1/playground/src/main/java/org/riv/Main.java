package org.riv;

import org.riv.dsa.SortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[6];

        array[0] = 38;
        array[1] = 42;
        array[2] = 20;
        array[3] = 13;
        array[4] = 35;

        SortingAlgorithms.printArray(SortingAlgorithms.selection(array));
    }
}