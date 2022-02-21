public class UseThree {
    public static void main(String[] args) {
        // Modify UseArgument.java to make a program UseThree.java that takes
        // three names as command-line arguments and prints a proper sentence
        // with the names in the reverse of the order given, so that,
        // for example,
        // java UseThree Alice Bob Carol prints
        // Hi Carol, Bob, and Alice.

        // [1. Reinterpret the problem]
        // Input: three names as command-line arguments
        // Output: a string that includes the names
        // Expected Change: the names in the sentence are in reverse order

        // [2. Search for similar problems]
        // Problem: P1.1.2 - UseArgument
        // General Approach
        // Use the print function and place arguments in between strings for
        // the names

        // [3. Adapting previous solutions]
        // Apply General Approach:
        // Same as UseArgument except we have to reverse the argument

        // [4. Evaluating solutions]
        // Approach on the right track: Yes
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:
        // Forgot to make the last print statement start a new line

        System.out.print("Hi ");
        System.out.print(args[2] + ", ");
        System.out.print(args[1] + ", and ");
        System.out.println(args[0] + ".");
    }
}
