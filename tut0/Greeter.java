public class Greeter {
    public static void main(String[] args) {
        if (args.length > 0) {
            greeter(args[0]);
        } else {
            System.out.println("Please provide a name as a command line argument.");
        }
    }
    public static void greeter(String name) {
        System.out.println("Hello, " + name + "! We are thrilled to have you with us. ");
    }
}
