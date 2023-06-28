import java.security.SecureRandom;
import java.lang.*;
public class PasswordGenerator {
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_-+=~`[]{}|\\:;\"'<>,.?/";

    public static void main(String[] args) {
        int length = 10; // Length of the generated password
        boolean includeUpperCase = true; // Include uppercase letters
        boolean includeLowerCase = true; // Include lowercase letters
        boolean includeDigits = true; // Include digits
        boolean includeSpecialCharacters = true; // Include special characters

        String generatedPassword = generatePassword(length, includeUpperCase, includeLowerCase, includeDigits, includeSpecialCharacters);
        System.out.println("Generated Password: " + generatedPassword);
    }

    public static String generatePassword(int length, boolean includeUpperCase, boolean includeLowerCase, boolean includeDigits, boolean includeSpecialCharacters) {
        StringBuilder password = new StringBuilder(length);
        SecureRandom random = new SecureRandom();

        String validCharacters = "";
        if (includeUpperCase) {
            validCharacters += UPPER_CASE;
        }
        if (includeLowerCase) {
            validCharacters += LOWER_CASE;
        }
        if (includeDigits) {
            validCharacters += DIGITS;
        }
        if (includeSpecialCharacters) {
            validCharacters += SPECIAL_CHARACTERS;
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validCharacters.length());
            password.append(validCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}