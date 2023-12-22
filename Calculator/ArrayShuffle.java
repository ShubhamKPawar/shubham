public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Original array: ");
        printArray(array);

        shuffleArray(array);

        System.out.print("Shuffled array: ");
        printArray(array);
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index j such that 0 <= j <= i
            int j = (int) (Math.random() * (i + 1));

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
