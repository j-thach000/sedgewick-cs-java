public class Distance {
    public static void main(String[] args) {
        // this program calculates the Euclidean distance between the origin
        // and the argument coordinates x y

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int ORIGIN = 0;

        double distance = Math.sqrt(((x - ORIGIN) * (x - ORIGIN)) + ((y - ORIGIN) * (y - ORIGIN)));

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);

    }
}
