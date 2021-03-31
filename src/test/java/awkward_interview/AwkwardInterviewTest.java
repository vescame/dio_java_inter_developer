package awkward_interview;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AwkwardInterviewTest {
    @Test
    public void validateOpenTestCase() {
        String str = "sanduicheiche\n" +
                "barrilarril\n" +
                "ratoato\n" +
                "sol\n" +
                "coliseueu\n" +
                "queijoijo\n" +
                "astroastro\n" +
                "a\n" +
                "testetetete\n" +
                "aaaaaaaaaa";
        try {
            AwkwardInterview.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
