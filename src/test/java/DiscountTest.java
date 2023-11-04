import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiscountTest {

    @ParameterizedTest
    @MethodSource ("validData")
    void discountCalc(int expectedDiscount, int i, int after18) {
        Discount discount = new Discount();
        assertEquals(expectedDiscount, discount.discountCalc(i, after18), "Wrong input");
    }

    static Stream<Arguments> validData() {   // data provider
        return Stream.of(
                arguments(0, 1, 0),
                arguments(2, 2, 0),
                arguments(4, 2, 1),
                arguments(2, 5, 1),

                arguments(0, 0, 0),
                arguments(0, 0, 1),
                arguments(0, 5, 2),
                arguments(0, -1, 0)
        );
    }


}