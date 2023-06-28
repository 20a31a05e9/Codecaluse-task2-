# Codecaluse-task2-
Password Generator

This code provides a simple password generator utility in Java. It generates a random password based on specified criteria such as length and character types.

The `PasswordGenerator` class includes the following character sets:
- `UPPER_CASE`: Uppercase letters (ABCDEFGHIJKLMNOPQRSTUVWXYZ)
- `LOWER_CASE`: Lowercase letters (abcdefghijklmnopqrstuvwxyz)
- `DIGITS`: Numeric digits (0123456789)
- `SPECIAL_CHARACTERS`: Special characters (!@#$%^&*()_-+=~`[]{}|\\:;\"'<>,.?/)

The `main` method demonstrates the usage of the `generatePassword` method to generate a password with specific configurations. It sets the desired password length and whether to include uppercase letters, lowercase letters, digits, and special characters. The generated password is then printed to the console.

The `generatePassword` method takes in the desired password length and boolean flags to determine which character sets to include. It constructs a `StringBuilder` to build the password and uses a `SecureRandom` instance to generate random indexes. Based on the selected character types, the method constructs a `validCharacters` string by concatenating the corresponding character sets. It then iterates `length` times and randomly selects characters from `validCharacters` to build the password.

The generated password is returned as a string.

Feel free to modify the code or adjust the character sets to fit your specific requirements for password generation.
