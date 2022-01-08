public class UniformRandom {
    public static void main(String[] args) {
        // generates 5 random numbers between 0 and 1
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        // prints the above
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. " + c);
        System.out.println("4. " + d);
        System.out.println("5. " + e);
        // takes the average of the five random numbers
        double average = (a + b + c + d + e) / (5);
        // prints the above
        System.out.println("Average: " + average);
        // finds the min and max of the random numbers
        // wtf lol
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
