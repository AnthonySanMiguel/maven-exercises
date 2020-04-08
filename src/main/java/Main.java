import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Stores user input entered in scanner prompt in 'input' variable
        boolean keepGoing = true;

        do {
            System.out.println("----------------------" + "\nType something: ");
            String userText = input.nextLine(); // Need 'Line' after next, else only the first word is returned

            if (!StringUtils.isNumeric(userText)) {
                System.out.println("\n" + "'" + userText + "'" + " is not a number.");
                System.out.println("'" + userText + "'" + " with case swap is: " + StringUtils.swapCase(userText));
                System.out.println("'" + userText + "'" + " reversed is: " + StringUtils.reverse(userText));
            } else {
                System.out.println("\n" + "'" + userText + "'" + " is a number. Try entering a message next time.");
            }
        } while(keepGoing);
    }
}
