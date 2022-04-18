public class Random {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double[] a = new double[n]; // array length determined by user input
        System.out.println("Contents of Array A:");
        for (int i = 0; i < n; i++)
        {
            a[i] = Math.random();
            System.out.println(a[i]);
        }

        System.out.println();

        double[] b = new double[n];
        System.out.println("Contents of Array B:");
        for (int i = 0; i < n; i++)
        { // copies values of array a to b
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}
