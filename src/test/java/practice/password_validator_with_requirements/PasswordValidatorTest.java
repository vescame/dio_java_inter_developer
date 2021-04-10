package practice.password_validator_with_requirements;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PasswordValidatorTest {
    @Test
    public void validateOpenTestCase() {
        String str = "Digital Innovation One\n" +
                "AbcdEfgh99\n" +
                "DigitalInnovationOne123\n" +
                "Digital Innovation One 123\n" +
                "Aass9\n" +
                "Aassd9";
        try {
            PasswordValidator.main(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
