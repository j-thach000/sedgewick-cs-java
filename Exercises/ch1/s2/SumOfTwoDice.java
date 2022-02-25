public class SumOfTwoDice {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise] WE1.2.20
        // Write a program SumOfTwoDice.java that prints the sum of two random
        // integers between 1 and 6 (such as you might get when rolling dice).

        // [1. Reinterpret the problem]
        // Input: none
        // Output: printed integer
        // Expected Change: two random integers summed

        // [2. Search for similar problems]
        // Problem: P1.2.5
        // General Approach:
        // 1. Generate a random number by calling the method Math.random() and
        //    multiplying it by n, causing n to be the largest number that can
        //    be generated.
        //          ***Math.random() generates a number between [0.0, 1.0)***
        // 2. If the end result in integer is desired, cast (int)
        // 3. This results in a random number between 0 and n-1
        //          ***casting (int) removes the numbers after the decimal***

        // [3. Adapting previous solutions]
        // Apply General Approach:
        // 1. Create variables for the "dice" = 6 (six sides)
        // 2. Randomize the dice outcome with the result of Math.random x dice
        // 3. Add back +1 to the result as that previous method generates a #
        //    between 0 and n-1

        // [4. Evaluating solutions]
        // Approach on the right track: Yes / No
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:

        // [5.Styling]
        // [x] Does each block of code with a special purpose have a concise
        // comment?
        // [x] Is each variable declared and initialized in one line?
        // [x] Are boolean expressions being used without redundancy?
        // [x] Are you properly documenting constants with all-caps names or
        // comments?
        // [x] Are variable names meaningful and appropriate?

        int DIE = 6;

        double randOne = Math.random();
        double randTwo = Math.random();

        int dieOne = (int) (randOne * DIE) + 1;
        int dieTwo = (int) (randTwo * DIE) + 1;

        int result = dieOne + dieTwo;

        System.out.println(result);
    }
}
