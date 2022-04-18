public class Copy {
    public static void main(String[] args) {
        // creates an array that contains 5 values
        double[] a = new double[5];
        System.out.println("Array A Contents:");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = i;
            System.out.println(a[i]);
        }

        System.out.println();

        // creates another array to copy values of array A to B
        System.out.println("Array B Contents:");
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }
}
