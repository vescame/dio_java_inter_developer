package password_validator_with_requirements;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Validador de senhas com requisitos
public class PasswordValidator {
//    public static void main(String[] args) throws IOException {
    public static void main(String str) throws IOException {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        final String specialCharsPattern = ".*[\\p{Punct}].*";
        final String lowerCasePattern = ".*[a-z].*";
        final String upperCasePattern = ".*[A-Z].*";
        final String numericPattern = ".*[0-9].*";
        final String spacesPatter = ".* .*";

        String password;
        while ((password = br.readLine()) != null) {
            if (password.matches(specialCharsPattern) ||
                    !password.matches(lowerCasePattern) ||
                    !password.matches(upperCasePattern) ||
                    !password.matches(numericPattern) ||
                    (password.length() < 6 || password.length() > 32) ||
                    password.matches(spacesPatter)) {
                System.out.println("Senha invalida.");
            } else {
                System.out.println("Senha valida.");
            }
        }
    }
}
