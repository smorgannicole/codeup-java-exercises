import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Ask Bob a question.");
        Scanner sc = new Scanner(System.in);
        String theQ = sc.nextLine();
        if (theQ.equals("")) {
            System.out.println("Fine. Be that way!");
            return;
        }

        int howLong = theQ.length();
        int howLongIndexed = howLong - 1;
        char whatIsIt = theQ.charAt(howLongIndexed);
        String addSpace = whatIsIt + " ";

        if (addSpace.equals("? ")) {
            System.out.println("Sure.");
        } else if (addSpace.equals("! ")) {
            System.out.println("Whoa, chill out!");
        } else System.out.println("Whatever.");
    }
}
