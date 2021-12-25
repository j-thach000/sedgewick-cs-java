public class UseArgument {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
        // What happens when I input these command lines:
        // a. java UseArgument java: executes correctly
        // b. java UseArgument @!&^%: executes incorrectly, bash error
        // c. java UseArgument 1234: executes correctly
        // d. java UseArgument.java Bob: executes incorrectly,
        // e. java UseArgument Alice Bob: executes correctly, ignores second argument
    }
}
