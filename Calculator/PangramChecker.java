public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Assuming input contains only English alphabet letters
        boolean[] alphabetCheck = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if ('A' <= currentChar && currentChar <= 'Z') {
                // Convert uppercase letter to corresponding index (0-25)
                int index = currentChar - 'A';
                alphabetCheck[index] = true;
            } else if ('a' <= currentChar && currentChar <= 'z') {
                // Convert lowercase letter to corresponding index (0-25)
                int index = currentChar - 'a';
                alphabetCheck[index] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean letterPresent : alphabetCheck) {
            if (!letterPresent) {
                return false; // At least one letter is missing
            }
        }

        return true; // All letters are present
    }
}
