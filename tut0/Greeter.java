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
        greeter();
    }
    
    public static void greeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
>>>>>>> 2f3becd ([#4] Remove Greeter.class and keep only Greeter.java)
    }
}
