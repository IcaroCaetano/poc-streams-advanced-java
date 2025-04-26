package com.myprojecticaro.poc_streams_advanced_java.application;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StreamService {

    private final List<String> names = List.of("Emma", "William", "James", "Sophia", "Lucas", "Sophia", "James");
    private final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /**
     * Demonstrates the usage of flatMap() to flatten a nested structure.
     *
     * @return A flattened list of strings.
     */
    public List<String> flatMapExample() {
        List<List<String>> nestedNames = List.of(List.of("Emma", "William"), List.of("James", "Sophia"));
        return nestedNames.stream()
                .flatMap(Collection::stream) // Flattens the nested lists into a single stream
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of distinct() to filter out duplicate elements.
     *
     * @return A list of unique names.
     */
    public List<String> distinctExample() {
        return names.stream()
                .distinct() // Removes duplicates
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of sorted() to sort elements in natural order.
     *
     * @return A sorted list of names.
     */
    public List<String> sortedExample() {
        return names.stream()
                .sorted() // Sorts in natural order (alphabetical for Strings)
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of limit() to limit the number of elements.
     *
     * @return A list containing the first 3 names.
     */
    public List<String> limitExample() {
        return names.stream()
                .limit(3) // Limits the result to the first 3 elements
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of skip() to skip the first N elements.
     *
     * @return A list containing the names after skipping the first 3.
     */
    public List<String> skipExample() {
        return names.stream()
                .skip(3) // Skips the first 3 elements
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of peek() to inspect elements during the stream pipeline.
     *
     * @return A list of names converted to uppercase with inspection.
     */
    public List<String> peekExample() {
        return names.stream()
                .peek(System.out::println) // Prints each element as it is processed
                .map(String::toUpperCase)  // Converts to uppercase
                .collect(Collectors.toList());
    }

    /**
     * Demonstrates the usage of joining() to join elements into a single string.
     *
     * @return A single string containing all names separated by commas.
     */
    public String joiningExample() {
        return names.stream()
                .collect(Collectors.joining(", ", "Names: ", ".")); // Joins elements with a separator and prefix/suffix
    }

    /**
     * Demonstrates the usage of groupingBy() to group elements by a condition.
     *
     * @return A map of names grouped by their first character.
     */
    public Map<Character, List<String>> groupingByExample() {
        return names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0))); // Groups by first character of each name
    }

    /**
     * Demonstrates the usage of partitioningBy() to partition elements into two groups.
     *
     * @return A map with two groups: names with length > 5 and others.
     */
    public Map<Boolean, List<String>> partitioningByExample() {
        return names.stream()
                .collect(Collectors.partitioningBy(name -> name.length() > 5)); // Partitions based on name length
    }

    /**
     * Demonstrates the usage of summarizingInt() to get statistics on a collection of numbers.
     *
     * @return A summary of the numbers (count, sum, min, average, max).
     */
    public IntSummaryStatistics summarizingIntExample() {
        return numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue)); // Summarizes the integers in the list
    }

    /**
     * Demonstrates the usage of parallelStream() for parallel processing.
     *
     * @return A list of numbers processed in parallel.
     */
    public List<Integer> parallelStreamExample() {
        return numbers.parallelStream()
                .map(n -> n * 2) // Doubles each element
                .collect(Collectors.toList());
    }
}
