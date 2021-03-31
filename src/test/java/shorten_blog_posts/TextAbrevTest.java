package shorten_blog_posts;

import org.junit.jupiter.api.Test;

import java.io.*;


public class TextAbrevTest {
    @Test
    public void testLongString() {
        final String str = "unchecking the use single class import will make intellij idea use\n" +
                "a single import statement alternatively we can also define this behaviour based\n" +
                "on the number of imported types using the class count which is set to 5 by default\n" +
                "by setting it to 1 we can instruct intellij idea to always import everything\n" +
                ".";

        try {
            TextAbrev.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
