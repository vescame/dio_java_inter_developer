package practice.find_longest_substring;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class LongestSubstrTest {
    @Test
    public void validateOpenTestCase() {
        String str = "abcdef\n" +
                "cdofhij\n" +
                "TWO\n" +
                "FOUR\n" +
                "abracadabra\n" +
                "open\n" +
                "Hey This java is hot\n" +
                "Java is a new paradigm";
        try {
            LongestSubstr.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
