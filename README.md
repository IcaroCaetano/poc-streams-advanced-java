# 🚀 Java Streams Advanced 

This project is a **Proof of Concept (POC)** developed with **Java 21** and **Spring Boot 3.x** to explore advanced features of the **Java Stream API** and showcase common **stream operations** used in real-world applications.

---

## 📚 Topics Demonstrated

Below are the advanced Stream operations demonstrated, each with explanations and practical examples.

### 🔄 `flatMap()`
Flattens nested collections into a single stream.

**Example**:
```java
List<List<String>> nested = List.of(List.of("Emma", "William"), List.of("James", "Sophia"));
nested.stream().flatMap(Collection::stream).toList();
// Output: ["Emma", "William", "James", "Sophia"]
```

### 🔁 distinct()
Removes duplicate elements from the stream.

**Example**:

```java
names.stream().distinct().toList();
// Output: ["Emma", "William", "James", "Sophia", "Lucas"]
```

### 🔤 sorted()
Sorts the stream in natural order (e.g., alphabetical).

**Example**:

```java
names.stream().sorted().toList();
// Output: ["Emma", "James", "James", "Lucas", "Sophia", "Sophia", "William"]
```

### 📏 limit()
Limits the number of elements in the stream.

**Example**:

```java
names.stream().limit(3).toList();
// Output: ["Emma", "William", "James"]
```

### ⏩ skip()
Skips a number of elements from the beginning.

**Example**:

```java
names.stream().skip(3).toList();
// Output: ["Sophia", "Lucas", "Sophia", "James"]
```

### 🔍 peek()
Used for debugging or inspecting elements as they pass through the stream.

**Example**:

```java
names.stream()
.peek(System.out::println)
.map(String::toUpperCase)
.toList();
```

### 🔗 joining()
Joins stream elements into a single string with delimiters, prefixes, and suffixes.

**Example**:

```java
names.stream().collect(Collectors.joining(", ", "Names: ", "."));
// Output: Names: Emma, William, James, Sophia, Lucas, Sophia, James.
```

### 🧮 groupingBy()
Groups elements by a classifier function.

**Example**:

```java
names.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
// Output: {E=[Emma], W=[William], J=[James, James], S=[Sophia, Sophia], L=[Lucas]}
```

### ⚖️ partitioningBy()
Splits elements into two groups based on a predicate.

**Example**:

```java
names.stream().collect(Collectors.partitioningBy(name -> name.length() > 5));
// Output: {false=[Emma, James, Lucas], true=[William, Sophia, Sophia]}
```

### 📊 summarizingInt()
Provides statistical summary (count, sum, min, average, max).

**Example**:

```java
numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
// Output: IntSummaryStatistics{count=10, sum=55, min=1, average=5.5, max=10}
```

### 🧵 parallelStream()
Processes stream operations in parallel.

**Example**:

```java
numbers.parallelStream().map(n -> n * 2).toList();
// Output: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
```

## 🧠 Functional Interface Concepts Used

| Interface           | Description                                   | Example                      |
|---------------------|-----------------------------------------------|------------------------------|
| `Predicate<T>`      | Filters elements based on a condition         | `x -> x > 5`                 |
| `Supplier<T>`       | Supplies values lazily                        | `() -> UUID.randomUUID()`   |
| `Consumer<T>`       | Performs an action on each element            | `x -> System.out.println(x)`|
| `UnaryOperator<T>`  | Applies a function to a single input          | `x -> x * 2`                 |
| `BinaryOperator<T>` | Combines two values into one                  | `(a, b) -> a + b`            |

## 🛠️ Technologies Used

✅ Java 21

✅ Spring Boot 3.x

✅ Maven or Gradle

✅ Spring Web

✅ Stream API


## 🚀 Running the Application

### Clone the repository

```bash

git clone https://github.com/your-username/java-streams-playground.git

cd java-streams-playground
```

### Run with 

```bash

./gradlew bootRun
```

### Or with Maven

```bash

./mvnw spring-boot:run
```

## 🌐 API Documentation
The project uses SpringDoc OpenAPI (Swagger UI).

Once running, access the API documentation at:

```bash

http://localhost:8080/swagger-ui.html
```

## ✍️ Author

Created by Icaro Caetano — Java Enthusiast exploring functional programming.

