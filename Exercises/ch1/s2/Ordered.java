public class Ordered {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise]
        // Write a program Ordered.java that takes three integer command-line
        // arguments, x, y, and z. Define a boolean variable whose value is
        // true if the three values are either in strictly ascending order
        // (x < y < z) or in strictly descending order (x > y > z), and false
        // otherwise. Then, print this boolean value.

        // [1. Reinterpret the problem]
        // Input: three integers x y z
        // Output:
        // Expected Change:
        // boolean variable that changes if the values are in strict ascending
        // (x < y < z) or descending order (x > y > z)

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
        // [x] Does each block of code with a special purpose have a comment?
        // [x] Is each variable declared and initialized in one line?
        // [x] Are boolean expressions being used without redundancy?
        // [x] Are you documenting constants with all-caps names or comments?
        // [x] Are variable names meaningful and appropriate?

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        // checks for either strictly ascending or descending order
        boolean orderedCheck = (x < y) && (y < z)
                || (x > y) && (y > z);


        System.out.println(orderedCheck);
    }
}
