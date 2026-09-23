package com.Dsa.Programs;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(nums);

        int arr[] = {5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 3);
        System.out.println("Index: " + index);

        int arr1[] = {4, 5, 6};
        int arr2[] = {1, 2, 3};

        System.out.println("Equals: " + Arrays.equals(arr1, arr2));
        System.out.println("Compare: " + Arrays.compare(arr1, arr2));

        int st[] = {1, 2, 3, 4, 5};
        int cpy[] = Arrays.copyOf(st, 3);
        System.out.println(Arrays.toString(cpy));

        int dt[] = new int[6];
        Arrays.fill(dt, 10);
        System.out.println(Arrays.toString(dt));
    }
}