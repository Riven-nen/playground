package org.riv;

import org.riv.dsa.SortingAlgorithms;
import org.riv.leetcode.solution;

public class Main {
    public static void main(String[] args) {
        int[] array = {};

        int[] newarray = solution.shiftArray(array);

        System.out.println("Input Array:");
        SortingAlgorithms.printArray(array);
        System.out.println("\nShifted Array:");
        SortingAlgorithms.printArray(newarray);

    }
}