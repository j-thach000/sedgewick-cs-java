public class Maximum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];
        double max = a[0];

        System.out.println("Contents of Array A");
        for (int i = 0; i < n; i++)
        { // populate the array with random values and print them
            a[i] = Math.random();
            System.out.println("Value " + i + ": " + a[i]);
            if (a[i] > max) max = a[i]; // find the largest array value
        }

        System.out.println("Maximum Value: " + max);
    }
}
