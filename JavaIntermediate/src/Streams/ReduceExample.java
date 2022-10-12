package Streams;

import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        int result = IntStream.range(1,5)
        .reduce(23, (a,b) -> a + b);

        System.out.println(result);
    }
}
