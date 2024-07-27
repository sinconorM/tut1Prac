/**
 * Greeter class contains methods for greeting and parting messages.
 */
public class Greeter {
    /**
     * Main method to start the application.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            greeter(args[0]);
        } else {
            String name = getName();
            greeter(name);
        }
    }

    /**
     * Prompts the user to enter their name and returns it.
     * @return The name entered by the user.
     */
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    /**
     * Prints a greeting message to the user.
     * @param name The name of the user.
     */
    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! We are thrilled to have you with us. " +
                           "Welcome to our community. We hope you have a fantastic experience here, " +
                           "learn a lot, and make great connections. Enjoy your journey!");
    }

    /**
     * Prints a parting message to the user.
     */
    public static void goodbye() {
        System.out.println("Goodbye! It was great having you here. We hope to see you again soon!");
    }
}

