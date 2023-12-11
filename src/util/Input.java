package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input () {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.println("Enter something: ");
        return scanner.nextLine();
    }
    public boolean yesNo() {
        System.out.println("Enter yes or no: ");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("yes");
    }
    public int getInt(int min, int max) {
        int value;
        do {
            System.out.printf("Enter an integer between %s and %s: ", min, max);
            value = scanner.nextInt();
        } while (!(value <= max && value >= min));
        return value;
    }
    public int getInt() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max) {
        double value;
        do {
            System.out.printf("Enter a double between %s and %s: ", min, max);
            value = scanner.nextDouble();
        } while (!(value <= max && value >= min));
        return value;
    }
    double getDouble() {
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }
}
