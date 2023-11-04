import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TreeTest {

    @ParameterizedTest
    @MethodSource("validData")
    void garlandLength(int expectedResult, int[] arr) {
        Tree tree = new Tree();
        assertEquals(expectedResult, tree.garlandLength(arr));
    }

    static Stream<Arguments> validData () {
        return Stream.of(
                arguments(4, new int[] {1, 2, 3, 4, 5}),
                arguments(8, new int[] {1, 4, 2, 3, 5})
        );
    }
}