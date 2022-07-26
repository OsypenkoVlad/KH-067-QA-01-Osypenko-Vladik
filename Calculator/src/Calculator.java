import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operator;
        double result;

        System.out.println("First value:");
        double firstvalue = CorrectNumb();

        System.out.println("Console operation:");
        operator = sc.next();

        System.out.println("Second value:");
        double secondvalue = CorrectNumb();

        switch (operator) {
            case "+": {
                result = firstvalue + secondvalue;
                System.out.println(firstvalue + operator + secondvalue + "=" + result);
                break;
            }
            case "-": {
                result = firstvalue - secondvalue;
                System.out.println(firstvalue + operator + secondvalue + "=" + result);
                break;
            }
            case "*": {
                result = firstvalue * secondvalue;
                System.out.println(firstvalue + operator + secondvalue + "=" + result);
                break;
            }
            case "/": {
                if (secondvalue != 0) {
                    result = firstvalue / secondvalue;
                    System.out.println(firstvalue + operator + secondvalue + "=" + result);
                    break;
                } else {
                    System.out.println("Divide by 0 again and I call the police!");
                }
                break;
            }
            case "%": {
                result = firstvalue % secondvalue;
                System.out.println(firstvalue + operator + secondvalue + "=" + result);
                break;
            }
            default: {
                System.out.println("Sweety, is not a correct operator. Try again i believe in you!");
            }
        }
    }

    public static double CorrectNumb() {
        Scanner sc = new Scanner(System.in);
        double first = 0;
        boolean validation;
        do {
            validation = sc.hasNextDouble();
            if (!validation) {
                System.out.println("Sweety, is not a correct value. Try again i believe in you!");
                sc.nextLine();
            } else {
                first = sc.nextDouble();
            }
        }
        while (!validation);
        return first;
    }
}