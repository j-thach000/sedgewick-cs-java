public class Stats5 {
    public static void main(String[] args) {
        // Calls Math.random to generate random values < 1
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double average = (a + b + c + d + e);

        // Nests methods in order to find min and max values
        double min = Math.min(a, (Math.min(b, Math.min(c, Math.min(d, e)))));
        double max = Math.max(a, (Math.max(b, Math.max(c, Math.max(d, e)))));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
