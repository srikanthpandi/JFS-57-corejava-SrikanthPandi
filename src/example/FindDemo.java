package com.dsaproblems.example;

import java.util.Arrays;

public class FindDemo {
    public static void main(String[] args) {
        String[] names = {"krishna","bheema","arjuna","balarama"};
        Arrays.sort(names); // ensure array is sorted

        String target = "arjuna";
        int left = 0;
        int right = names.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = names[mid].compareTo(target);

            if (cmp == 0) {
                System.out.println("found at: " + mid);
                found = true;
                break;
            } else if (cmp > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}
