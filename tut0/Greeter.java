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

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! We are thrilled to have you with us. ");
    }
}

