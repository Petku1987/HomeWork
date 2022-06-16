import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("Choose your language");
        System.out.println("For English ENTER 1");
        System.out.println("FOR Romanian ENTER 2");
        System.out.println("FOR Russian ENTER 3");
        System.out.println("FOR Ukraine ENTER 4");
        a = input.nextInt();

        if (a==1)
            System.out.println("Hello My Friend");
        if (a==2)
            System.out.println("Salut Prietene");
        if (a==3)
            System.out.println("Привет мой друг");
        if (a==4)
            System.out.println("Привіт, мій друже");

    }
}
