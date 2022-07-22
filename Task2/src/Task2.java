import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable1, variable2;
        System.out.println("What is your name?");
        variable1 = scanner.nextLine();
        System.out.println("Where are you live?");
        variable2 = scanner.nextLine();
        System.out.println("Congratulations!");
        System.out.println(("Your name is:") + variable1);
        System.out.println(("You live in:") + variable2);

    }
}
