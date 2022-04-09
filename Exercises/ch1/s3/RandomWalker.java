public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        int origin = 0;
        System.out.println("(" + x + ", " + y + ")");

        int dist = 0;

        int steps = 0;

        while (dist < r)
        { // continues as long as the Manhattan distance is equal to the input
            double direction = Math.random();
            if      (direction < 0.25) y++; // north
            else if (direction < 0.50) y--; // south
            else if (direction < 0.75) x++; // east
            else if (direction < 1)    x--; // west

            dist = Math.abs((origin - x)) + Math.abs((origin - y));

            steps++;

            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
