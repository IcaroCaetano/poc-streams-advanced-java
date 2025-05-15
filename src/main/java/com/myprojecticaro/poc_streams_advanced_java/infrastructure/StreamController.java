package com.myprojecticaro.poc_streams_advanced_java.infrastructure;

import com.myprojecticaro.poc_streams_advanced_java.application.StreamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/streams")
@Tag(name = "Java Streams", description = "Demonstrates Java Stream operations")
public class StreamController {

    private final StreamService service;

    public StreamController(StreamService service) {
        this.service = service;
    }

    @Operation(summary = "Flatten nested lists into a single list")
    @ApiResponse(responseCode = "200", description = "Successfully flattened list")
    @GetMapping("/flatMap")
    public List<String> flatMapExample() {
        return service.flatMapExample();
    }

    @Operation(summary = "Remove duplicate names")
    @ApiResponse(responseCode = "200", description = "Successfully removed duplicates")
    @GetMapping("/distinct")
    public List<String> distinctExample() {
        return service.distinctExample();
    }

    @Operation(summary = "Sort names alphabetically")
    @ApiResponse(responseCode = "200", description = "Successfully sorted names")
    @GetMapping("/sorted")
    public List<String> sortedExample() {
        return service.sortedExample();
    }

    @Operation(summary = "Limit the number of elements to 3")
    @ApiResponse(responseCode = "200", description = "Successfully limited the result")
    @GetMapping("/limit")
    public List<String> limitExample() {
        return service.limitExample();
    }

    @Operation(summary = "Skip the first 3 names")
    @ApiResponse(responseCode = "200", description = "Successfully skipped elements")
    @GetMapping("/skip")
    public List<String> skipExample() {
        return service.skipExample();
    }

    @Operation(summary = "Inspect elements using peek and convert to uppercase")
    @ApiResponse(responseCode = "200", description = "Successfully peeked and transformed elements")
    @GetMapping("/peek")
    public List<String> peekExample() {
        return service.peekExample();
    }

    @Operation(summary = "Join all names into a single string")
    @ApiResponse(responseCode = "200", description = "Successfully joined names")
    @GetMapping("/joining")
    public String joiningExample() {
        return service.joiningExample();
    }

    @Operation(summary = "Group names by their first character")
    @ApiResponse(responseCode = "200", description = "Successfully grouped names")
    @GetMapping("/groupingBy")
    public Map<Character, List<String>> groupingByExample() {
        return service.groupingByExample();
    }

    @Operation(summary = "Partition names based on length > 5")
    @ApiResponse(responseCode = "200", description = "Successfully partitioned names")
    @GetMapping("/partitioningBy")
    public Map<Boolean, List<String>> partitioningByExample() {
        return service.partitioningByExample();
    }

    @Operation(summary = "Summarize statistics from a list of integers")
    @ApiResponse(responseCode = "200", description = "Successfully summarized values")
    @GetMapping("/summarizingInt")
    public IntSummaryStatistics summarizingIntExample() {
        return service.summarizingIntExample();
    }

    @Operation(summary = "Double each number using parallel stream")
    @ApiResponse(responseCode = "200", description = "Successfully processed with parallel stream")
    @GetMapping("/parallelStream")
    public List<Integer> parallelStreamExample() {
        return service.parallelStreamExample();
    }
}
