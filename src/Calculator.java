import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int sum;
        int avg;

        System.out.println("Introduceti cifra: ");
        x = input.nextInt();
        System.out.println("Introduceti cifra: ");
        y = input.nextInt();

        sum = x + y;
        System.out.println("Suma acestora va fi: " + sum);

        avg = (x + y) / 2;
        System.out.println("Media acestora va fi: " + avg);

        if (x>y)
            System.out.println(x + " Este mai mare decat " + y);
        if (x<y)
            System.out.println(x + " Este mai mic decat " + y);
        else
            System.out.println(x + " Este egal cu " + y);


    }
}
