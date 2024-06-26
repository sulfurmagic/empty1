import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class MaxServiceTest {

    @Test
    void findMax() {
        MaxService service = new MaxService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        MaxService service = new MaxService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 4, 10};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}

