import java.util.Scanner;
public class Greeter {
    public static void main(String[] args) {
<<<<<<< HEAD
	    System.out.println(getName());
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
=======
        if (args.length > 0) {
            greeter(args[0]);
        } else {
            System.out.println("Please provide a name as a command line argument.");
        }
    }
    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! We are thrilled to have you with us. ");
>>>>>>> feature_argument_greeter
    }
}
