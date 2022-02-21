public class HiFour {
    public static void main(String[] args) {
        // Write a program HiFour.java that takes 4 first names as command-line
        // arguments and prints a proper sentence with the names in the reverse
        // of the order given.

        // [1. Reinterpret the problem]
        // Input: four command-line arguments
        // Output: a string that contains the arguments
        // Expected Change: the arguments are printed in reverse order

        // [2. Search for similar problems]
        // Problem: 1.1.6 - UseThree
        // General Approach
        // Use print function to create strings with arguments in them
        // Reverse the order of the arguments

        // [3. Adapting previous solutions]
        // Apply General Approach:
        // Same as before except we include an additional name

        // [4. Evaluating solutions]
        // Approach on the right track: Yes / No
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:

        System.out.print("Hi ");
        System.out.print(args[3] + ", ");
        System.out.print(args[2] + ", ");
        System.out.print(args[1] + ", and ");
        System.out.println(args[0] + ".");
    }
}
