public class GeneralizedHarmonic {
    public static void main(String[] args) {

        // inputs
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        // tracks total from each loop
        double sum = 0;

        // adds a calculation's result to sum
        for (int i = 1; i <= n; i++) {
            sum += (1/(Math.pow(i, r)));

        }
        System.out.println(sum);
    }
}
