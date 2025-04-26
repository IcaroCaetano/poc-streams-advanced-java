package com.myprojecticaro.poc_streams_advanced_java.infrastructure;

import com.myprojecticaro.poc_streams_advanced_java.application.StreamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;

@RestController
@RequestMapping("/streams")
public class StreamController {

    private final StreamService service;

    public StreamController(StreamService service) {
        this.service = service;
    }

    @GetMapping("/flatMap")
    public List<String> flatMapExample() {
        return service.flatMapExample();
    }

    @GetMapping("/distinct")
    public List<String> distinctExample() {
        return service.distinctExample();
    }

    @GetMapping("/sorted")
    public List<String> sortedExample() {
        return service.sortedExample();
    }

    @GetMapping("/limit")
    public List<String> limitExample() {
        return service.limitExample();
    }

    @GetMapping("/skip")
    public List<String> skipExample() {
        return service.skipExample();
    }

    @GetMapping("/peek")
    public List<String> peekExample() {
        return service.peekExample();
    }

    @GetMapping("/joining")
    public String joiningExample() {
        return service.joiningExample();
    }

    @GetMapping("/groupingBy")
    public Map<Character, List<String>> groupingByExample() {
        return service.groupingByExample();
    }

    @GetMapping("/partitioningBy")
    public Map<Boolean, List<String>> partitioningByExample() {
        return service.partitioningByExample();
    }

    @GetMapping("/summarizingInt")
    public IntSummaryStatistics summarizingIntExample() {
        return service.summarizingIntExample();
    }

    @GetMapping("/parallelStream")
    public List<Integer> parallelStreamExample() {
        return service.parallelStreamExample();
    }
}
