public class CodeFragment {
    public static void main(String[] args) {
        double x1 = (double) 3 / 5;
        System.out.println(x1);
        // integer division is done before casting

        int x2 = 65536;
        long y = x2 * x2;
        System.out.println(y);
        // integer overflow

        boolean a = (Math.sqrt(2) * Math.sqrt(2) == 2);
        System.out.println(a);
    }
}
