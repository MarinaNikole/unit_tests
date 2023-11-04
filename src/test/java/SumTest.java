import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SumTest {

    @ParameterizedTest                // чтобы использовать параметризированный метод
    @MethodSource("validData")       // чтобы связать с Data Provider
    void sumOfTwoNumbers(int expectedResult, int a, int b) {
        Sum sum = new Sum();
        assertEquals(expectedResult, sum.sumOfTwoNumbers(a, b), "Incorrect calculation");

    }

    static Stream<Arguments> validData() {               // параметризированный метод
        return Stream.of(                              // data provider
                arguments(5, 3, 2),
                arguments(-9, -5, -4),
                arguments(-1, -2, 1),
                arguments(1, 3, -2),
                arguments(0, 0, 0),
                arguments(120, 0, 120),
                arguments(340, 340, 0)
        );
    }

}


// create data suit for testing method sumOfTwoNumbers
//(1, 2)
//(-1, -3)
//(-1, -2)
//(0, 0)
//(-1, 0)
// assertEquals(6, sum.sumOfTwoNumbers(4, 2), "Incorrect calculation"); //ожидаемый результат 6
