package prikhozhaev;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Providers {
    private Providers() {

    }

    public static Stream<Arguments> testSort() {
        return Stream.of(
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{-3, -1, 4, 5, 22}, new int[]{22, 5, 4, -1, -3}),
                arguments(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1})

        );
    }

    public static Stream<Arguments> testCompareObjects() {
        return Stream.of(
                arguments(null, 5),
                arguments(5, 5),
                arguments("test", 1),
                arguments("test", "test")
        );
    }

    public static Stream<Arguments> testCompareToString() {
        return Stream.of(
                arguments(null, null),
                arguments(59, 60),
                arguments(60, 60),
                arguments("test", "test")
        );
    }

    public static Stream<Arguments> testCompareHashCode() {
        return Stream.of(
                arguments(null, null),
                arguments(59, 60),
                arguments(60, 60),
                arguments("test", "test")
        );
    }
}
