public class ThreeSort {
    public static void main(String[] args) {
        // three command line integer arguments
        // prints them
        // ascending order: from smallest to biggest
        int a = Integer.parseInt(args[0]); // 1
        int b = Integer.parseInt(args[1]); // 2
        int c = Integer.parseInt(args[2]);
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        System.out.println("Ascending Order:");
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
