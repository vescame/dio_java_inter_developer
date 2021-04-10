package arithmetic.number_analysis;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class NumberAnalysisTest {
    @Test
    public void validateOpenTestCase() {
        String str = "-5\n" +
                "0\n" +
                "-3\n" +
                "-4\n" +
                "12";

        try {
            NumberAnalysis.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
