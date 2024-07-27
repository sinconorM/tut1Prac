import java.util.Scanner;
public class Greeter {
    public static void main(String[] args) {
	    System.out.println(getName());
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}
