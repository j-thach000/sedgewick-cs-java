public class Average {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];
        double sum = 0.0;

        // generate random values, print each of them out, then average
        for (int i = 0; i < n; i++)
        {
            a[i] = Math.random();
            sum += a[i];
            System.out.println("Value " + i + ": " + a[i]);
        }

        // the average of n randomly generated values
        double average = sum / n;
        System.out.println("Average: " + average);
    }
}
