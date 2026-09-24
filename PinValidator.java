import java.util.Scanner;

public class PinValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pin = 0;
        boolean isValid = false;

        while (!isValid) {

            System.out.print("Enter your 4-digit Mobile Money PIN: ");

            if (input.hasNextInt()) {

                pin = input.nextInt();

                if (pin >= 1000 && pin <= 9999) {
                    isValid = true;
                } else {
                    System.out.println(
                        "Invalid PIN. PIN must contain exactly 4 digits."
                    );
                }

            } else {

                System.out.println(
                    "Invalid input. Please enter numbers only."
                );

                input.next();
            }
        }

        System.out.println("PIN accepted.");

        input.close();
    }
}