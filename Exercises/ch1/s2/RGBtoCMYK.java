public class RGBtoCMYK {
    public static void main(String[] args) {
        // Consult print out if needing more detail
        // [Exercise] WA1.2
        // Write a program RGBtoCMYK.java that converts from RGB format to CMYK
        // format. Your program must take three integer command-line arguments,
        // red, green, and blue; print the RGB values; then print the
        // equivalent CMYK values using the following mathematical formulas.

        // [1. Reinterpret the problem]
        // Input: three integer command-line arguments
        // Output: print RGB values and the equivalent CMYK values
        // Expected Change: RGB input converted to CMYK via formulas

        // [2. Search for similar problems]
        // Problem: N/A
        // General Approach: N/A

        // [3. Adapting previous solutions]
        // Apply General Approach: N/A

        // [4. Evaluating solutions]
        // Approach on the right track: Yes / No
        // No - Alternative analogous problem:
        // Yes - Evaluate and verify correctness:

        // [5. Styling]
        // [] Does each block of code with a special purpose have a concise
        // comment?
        // [] Is each variable declared and initialized in one line?
        // [] Are boolean expressions being used without redundancy?
        // [] Are you properly documenting constants with all-caps names or
        // comments?
        // [] Are variable names meaningful and appropriate?

        double R = Double.parseDouble(args[0]);
        double G = Double.parseDouble(args[1]);
        double B = Double.parseDouble(args[2]);

        double W = Math.max((R / 255), Math.max(G / 255, B / 255));

        double C = (W - (R / 255)) / W;
        double M = (W - (G / 255)) / W;
        double Y = (W - (B / 255)) / W;
        double K = 1 - W;

        System.out.println("red     = " + (int) R);
        System.out.println("green   = " + (int) G);
        System.out.println("blue    = " + (int) B);
        System.out.println("cyan    = " + C);
        System.out.println("magenta = " + M);
        System.out.println("yellow  = " + Y);
        System.out.println("black   = " + K);
    }
}
