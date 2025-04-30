import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times would you like to roll the dice? ");
        int rolls = input.nextInt();

        Random random = new Random();
        int[] outcomes = new int[rolls];

        for (int index = 0; index < rolls; index++) {
            outcomes[index] = random.nextInt(6) + 1;
            System.out.print(outcomes[index] + " ");
        }
    }
}
