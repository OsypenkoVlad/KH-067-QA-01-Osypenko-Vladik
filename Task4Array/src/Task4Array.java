import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task4Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter at least three words separated by commas:");
        String str = sc.nextLine();
        String[] array = str.split(", ");
        if (array.length >= 3) {
            do {
                char operation = 0;
                System.out.println("Choose a filter:");
                System.out.println("1 - maximum length\n2 - start with\n3 - end with\n4 - contains\n0 - exit");
                operation = sc.next().charAt(0);
                switch (operation) {
                    case '1':
                        System.out.println("Enter the maximum length:");
                        int k = sc.nextInt();
                        System.out.println("Result:");
                        IntStream.range(0, array.length).filter(i -> array[i].length() <= k).mapToObj(i -> array[i]).forEach(System.out::println);
                        break;
                    case '2':
                        System.out.println("Enter the beginning of the line:");
                        String f_str = sc.next();
                        System.out.println("Result:");
                        IntStream.range(0, array.length).filter(i -> array[i].startsWith(f_str) == true).mapToObj(i -> array[i]).forEach(System.out::println);
                        break;
                    case '3':
                        System.out.println("Enter ending of the line:");
                        String l_str = sc.next();
                        System.out.println("Result:");
                        Arrays.stream(array).filter(s -> s.endsWith(l_str) == true).forEach(System.out::println);
                        break;
                    case '4':
                        System.out.println("Enter part of a string:");
                        String e_str = sc.next();
                        System.out.println("Result:");
                        IntStream.range(0, array.length).filter(i -> array[i].contains(e_str) == true).mapToObj(i -> array[i]).forEach(System.out::println);
                        break;
                    case '0':
                        System.exit(0);
                    default:
                        System.out.println("Error. Unidentified operation.");
                        System.exit(1);
                }
            }while(true);
        } else {
            System.out.println("Not enough words.");
            System.exit(1);
        }
    }
}