
import java.util.Scanner;

public class PairsOfFactors {
    public static void main(String[] args) {

        int x, y;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cifra: ");
        x = input.nextInt();
        System.out.println("Metodele de inmultire cu rezultatul cifrei introduse");

        for (y = 2; y * y <= x; y++) {
            if (x % y == 0) {
                int z = x / y;
                System.out.println(y + " x " + z) ;

            }
        }
    }
}

