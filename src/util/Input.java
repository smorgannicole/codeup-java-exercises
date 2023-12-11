package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return scanner.nextLine();
    }
    public boolean yesNo(){
        String userChoice = scanner.nextLine();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getInt(min, max);
        }
        int userNum = Integer.parseInt(userInput);
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("You did not enter a number between " + min + " and " + max + ". Try again.");
            return getInt(min, max);
        }
    }
    public int getInt(){
        String userInput = getString();
        try {
            Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("You did not enter a valid number. Please try again.");
            return getInt();
        }
        int userNum = Integer.parseInt(userInput);
        return Integer.parseInt(userInput);
    }
    public double getDouble(double min, double max){
        String userInput = scanner.nextLine();
        try {
            Double.valueOf(userInput);
        } catch(NumberFormatException e){
            System.out.println("You did not enter a valid number. Please try again.");
            return getDouble(min, max);
        }
        double userNum = Double.parseDouble(userInput);
        if(userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("You did not enter a number between " + min + " and " + max + ". Try again.");
            return getDouble(min, max);
        }
    }
    public double getDouble(){
        String userInput = scanner.nextLine();
        try {
            Double.valueOf(userInput);
        } catch(NumberFormatException e){
            System.out.println("You did not enter a valid number. Please try again.");
            return getDouble();
        }
        double userNum = Double.parseDouble(userInput);
        return userNum;
    }
}