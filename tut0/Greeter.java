import java.util.Scanner;

public class Greeter {
    public static void main(String[] args) {

        if (args.length > 0) {
            greeter(args[0]);
        } else {
            String name = getName();
            greeter(name);
        }
    }

    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! We are thrilled to have you with us. " +
                           "Welcome to our community. We hope you have a fantastic experience here, " +
                           "learn a lot, and make great connections. Enjoy your journey!");

        System.out.println(getName());
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}

