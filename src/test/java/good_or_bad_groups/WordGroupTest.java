package good_or_bad_groups;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class WordGroupTest {
    @Test
    public void testOpenTestCase() {
        final String str = "3\n" +
                "abc\n" +
                "dae\n" +
                "abcde\n" +
                "2\n" +
                "abc\n" +
                "def\n" +
                "0";

        try {
            WordGroup.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
