public class FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5; // The total number of rows to print
        int number = 1; // The starting value for our counter

        // Outer loop handles the number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop handles the numbers printed in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the counter after printing
            }
            
            // Move to the next line after completing the inner loop
            System.out.println();
        }
    }
}