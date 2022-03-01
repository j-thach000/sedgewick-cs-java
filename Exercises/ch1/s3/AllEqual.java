public class AllEqual {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise]
        // Write a program AllEqual.java that takes three integer command-line
        // arguments and prints equal if all three are equal, and not equal
        // otherwise.

        // [1. Reinterpret the problem]
        // Input: three integers
        // Output: print statement true or false if they're all equal
        // Expected Change: boolean logic true or false

        // [2. Search for similar problems]
        // Problem: P1.1.1
        // General Approach: plug and chug the syntax

        // [3. Adapting previous solutions]
        // Apply General Approach: using comparisons and boolean, == &&

        // [4. Evaluating solutions]
        // Approach on the right track: Yes / No
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:
        //

        // [5. Styling]
        // [] Does each block of code with a special purpose have a concise comment?
        // [] Is each variable declared and initialized in one line?
        // [] Are boolean expressions being used without redundancy?
        // [] Are you properly documenting constants with all-caps names or comments?
        // [] Are variable names meaningful and appropriate?

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // checks if the command-line arguments are all equal
        if (a == b && a == c) System.out.println("True");
        else                  System.out.println("False");

    }
}
