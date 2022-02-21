public class SumThree {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise]
        // Write a program SumThree.java that takes three int command-line
        // arguments and prints the three integers and their sum in the form of
        // an equation.

        // [1. Reinterpret the problem]
        // Input: takes three integer command-line arguments
        // Output: a string that looks like an equation
        // Expected Change: integers are all summed

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
        // Does each block of code with a special purpose have a concise
        // comment?
        // Is each variable declared and initialized in one line?

        // converts the command-line arguments into integer data type
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // sums all variables
        int sum = a + b + c;

        // prints a string that looks like an equation
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }
}
