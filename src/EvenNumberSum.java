public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;

        // Using a for loop to iterate from 2 to 100 with a step of 2
        for (int i = 2; i <= 100; i += 2) {
            // Adding the current even number to the sum
            sum += i;
        }

        System.out.println("SUMMARY OF EVEN NUMBERS FROM 1 TO 100: " + sum);
    }
}
