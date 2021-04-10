package arithmetic.dividers;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DividersTest {
    @Test
    public void validateOpenTestCase() {
        String[] str = {
                "2 12 8 2",
                "3 4 60 105",
                "151878189 131963689 438166849 780261216",
                "2 40 90 25"
        };
        try {
            for (String s : str) {
                Dividers.main(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
