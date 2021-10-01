package com.company.averagefinder;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] insertShiftArray (int[] myArr , int newItem) {
        int mid;
        int newArr[] = new int[myArr.length + 1];
        mid = myArr.length % 2 == 0 ?  mid = myArr.length / 2 : myArr.length / 2 + 1 ;

        for (int i = 0; i <newArr.length ; i++) {

            if (i < mid) {
                newArr[i] = myArr[i];
            }
            else if (i == mid) {
                newArr[i] = newItem;
            }
            else {
                newArr[i] = myArr[i-1];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int x[] = {5,4,6,7,8};
        System.out.println(Arrays.toString(insertShiftArray(x,5)));
    }
}
