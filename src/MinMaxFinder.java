import java.util.Random;

public class MinMaxFinder {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        int smallest = Integer.MAX_VALUE;

        int largest = Integer.MIN_VALUE;


        while (count < 10) {

            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Random number " + (count + 1) + ": " + randomNumber);

            smallest = Math.min(smallest, randomNumber);
            largest = Math.max(largest, randomNumber);

            count++;
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
