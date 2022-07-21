import java.util.Scanner;

public class Task2 { public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);
    String s1, s2;
    System.out.println("What is your name?");
    s1 = scanner.nextLine();
    System.out.println("Where are you live?");
    s2 = scanner.nextLine();
    System.out.println("Congratulations!");
    System.out.println(("Your name is:") + s1);
    System.out.println(("You live in:") + s2);

}
}
