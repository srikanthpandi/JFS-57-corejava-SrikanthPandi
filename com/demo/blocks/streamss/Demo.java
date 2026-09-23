package com.demo.blocks.streamss;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> number = Arrays.asList(12,39,40,50,60,36,66,1,4,2,10);
        List<String> name = Arrays.asList("ramesh","ganesh","rahul","meenakshi");
        
        // Print numbers greater than 40
        number.stream().filter(i -> i > 40).forEach(System.out::println);
        
        // Get lengths of names
        List<Integer> lengths = name.stream()
                                    .map(n -> n.length())
                                    .collect(Collectors.toList());
        System.out.println(lengths);
        
        // Double each number (corrected)
        number.stream().map(i -> i * 2).forEach(System.out::println);
        
        // Count failed students (<40)
        long failedStudents = number.stream().filter(marks -> marks < 40).count();
        System.out.println(failedStudents);
        
        // Sort names ascending
        name.stream().sorted().forEach(System.out::println);
        
        // Sort names descending
        name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        // Print distinct even numbers
        number.stream().filter(n -> n % 2 == 0).distinct().forEach(System.out::println);
        
        // Limit to first 5 numbers
        number.stream().limit(5).forEach(System.out::println);
        
        // Skip first 5 numbers
        number.stream().skip(5).forEach(System.out::println);

        // Find max and min
        Integer maxValue = number.stream().max(Integer::compare).get();
        System.out.println(maxValue);
        
        Integer minValue = number.stream().min(Integer::compare).get();
        System.out.println(minValue);
    }
}
