public class DivideEven {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise]
        // 1.2.14 Write a program that takes two positive integers as
        // command-line arguments and prints true if either evenly divides the
        // other.

        // [1. Reinterpret the problem]
        // Input: two positive integers via command-line arguments
        // Output: prints true only if the integers evenly divide themselves
        // Expected Change: a check occurs if the integers divide evenly

        // [2. Search for similar problems]
        // Problem: N/A
        // General Approach: N/A

        // [3. Adapting previous solutions]
        // Apply General Approach: N/A

        // [4. Evaluating solutions]
        // Approach on the right track: Yes / No
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:

        // [5.Styling]
        // Does each block of code with a special purpose have a concise comment?
        // Is each variable declared and initialized in one line?
        //

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // A boolean check to see if either variable evenly divides the other.
        boolean checkRemainder = (a % b == 0) || (b % a == 0);

        System.out.println("Even Division: " + checkRemainder);
    }
}
