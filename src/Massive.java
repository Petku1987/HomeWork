import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + (i + 1) + " цифру:");

            numbers[i] = in.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Введенные цифры по возрастанию :");

        System.out.println(Arrays.toString(numbers));
    }
}

