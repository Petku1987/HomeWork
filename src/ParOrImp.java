import java.util.Scanner;

public class ParOrImp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("Introduceti cifra");
        x = input.nextInt();

        if (x % 2 == 0)
            System.out.println("Cifra este para");
        else {System.out.println("Cifra este impara");

        }
    }
}
