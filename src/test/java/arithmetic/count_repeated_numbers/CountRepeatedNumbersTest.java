package arithmetic.count_repeated_numbers;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CountRepeatedNumbersTest {
    @Test
    public void validateOpenTestCase() {
        String str = "7\n" +
                "8\n" +
                "10\n" +
                "8\n" +
                "260\n" +
                "4\n" +
                "10\n" +
                "10";

        try {
            CountRepeatedNumbers.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
