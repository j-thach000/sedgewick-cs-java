public class Distancev2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // allows inputs
        double dist = Math.sqrt((x * x) + (y * y));
        // euclidean distance formula
        System.out.println(dist);
        // printed euclidean distance output
    }
}
