public class GeneralizedHarmonic {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise]
        // Write a program GeneralizedHarmonic.java that takes two integer
        // command-line arguments n and r and uses a for loop to compute the nth
        // generalized harmonic number of order r, which is defined by the
        // following formula: 1/1^r, 1/2^r, ...

        // [1. Reinterpret the problem]
        // Input: two integers
        // Output: the nth generalized harmonic number of order r
        // Expected Change:
        // for loop increments and a new harmonic number is made each loop
        // the denominator increases to equal the input n

        // [2. Search for similar problems]
        // Problem: P1.3.5
        // General Approach: Create a for loop that iterates in the formula
        // with variables

        // [3. Adapting previous solutions]
        // Apply General Approach: Loop has to be modified with Math.pow()

        // [4. Evaluating solutions]
        // Approach on the right track: Yes
        // Yes - Evaluate and verify correctness:
        //

        // [5. Styling]
        // [] Does each block of code with a special purpose have a concise comment?
        // [] Is each variable declared and initialized in one line?
        // [] Are boolean expressions being used without redundancy?
        // [] Are you properly documenting constants with all-caps names or comments?
        // [] Are variable names meaningful and appropriate?

        // Computes the nth generalized harmonic number
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++)
        {  // Adds the ith term to the sum
           sum += 1.0 / Math.pow(i, r);
        }
        System.out.println(sum);
    }
}
