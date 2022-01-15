public class ThreeEqual {
    public static void main(String[] args) {
        // input: integer command line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // type conversion
        int sum = a + b + c;

        // output: print statements stating whether the arguments are equal
        if (sum / a == 3) System.out.println("equal");
        else System.out.println("not equal");
    }
}
