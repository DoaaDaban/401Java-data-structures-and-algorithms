package com.company.averagefinder;

public class Main {
    static int[] reverseArray (int[] arr) {
        int newArr[] = new int[arr.length];
        int counter = 0;
        for (int i = arr.length -1 ; i >= 0 ; i--) {
            newArr[counter] = arr[i];
            counter++;
        }

        return newArr;
    }
    public static void main(String[] args) {
        int x[] = {5,4,6,7,8};
        int y [] = reverseArray(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(y[i]);
        }
    }
}

