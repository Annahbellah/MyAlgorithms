package com.bella;

public class Main {
    // write a function that returns the minimum number in an array.
    static int min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    }


