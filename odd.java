public class oddNumbers {
    public static void main(String[] args) {
        // Define the range
        int start = 1; // Starting number
        int end = 20;  // Ending number

        // Loop through the range and check for odd numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.println(i); // Print the odd number
            }
}
