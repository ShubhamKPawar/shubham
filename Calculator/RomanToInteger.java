import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer representation: " + result);
    }

    public static int romanToInteger(String romanNumeral) {
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = charToValue(currentChar);

            if (i + 1 < romanNumeral.length()) {
                char nextChar = romanNumeral.charAt(i + 1);
                int nextValue = charToValue(nextChar);

                // If the value of the current character is less than the value of the next character,
                // subtract it from the result; otherwise, add it to the result.
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // Last character, always add its value to the result
                result += currentValue;
            }
        }

        return result;
    }

    public static int charToValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
