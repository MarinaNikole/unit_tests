import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CostTest {

    @ParameterizedTest
    @MethodSource("validData")
    void deliveryCostCalc(int expectedCost, double distance, boolean big, boolean fragile, String load) {
        Cost cost = new Cost();
        assertEquals(expectedCost, cost.deliveryCostCalc(distance, big, fragile, load));
    }

    static Stream <Arguments> validData () {
        return Stream.of(
                arguments(400, 2, true, false, "повышенная"),
                arguments(400, 2, true, false, "высокая"),
                arguments(400, 2, true, false, "очень высокая"),

                arguments(400, 2, false, false, "повышенная"),
                arguments(400, 2, false, false, "высокая"),
                arguments(400, 2, false, false, "очень высокая"),

                arguments(540, 2, false, true, "повышенная"),
                arguments(630, 2, false, true, "высокая"),
                arguments(720, 2, false, true, "очень высокая"),

                arguments(600, 10, false, true, "повышенная"),
                arguments(840, 30, false, true, "высокая"),
                arguments(800, 30.1, true, false, "очень высокая"),

                arguments(0, 30.1, false, true, "очень высокая"),
                arguments(0, 0, true, false, "высокая"),   //
                arguments(600, 10, false, true, "Повышенная")    //

        );
    }
}