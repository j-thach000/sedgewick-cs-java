public class RandomWalker {
    public static void main(String[] args) {
        // desired Manhattan distance
        int r = Integer.parseInt(args[0]);

        // current coordinates of the walker
        int x = 0;
        int y = 0;

        // assigns walker starting point and prints it
        int origin = 0;
        System.out.println("(" + x + ", " + y + ")");

        // current value of the Manhattan distance
        int dist = 0;

        // current value of steps taken
        int steps = 0;

        while (dist < r)
        { // loop continues until the Manhattan distance is equal to the input
            // walker has a 25% chance of walking in each cardinal direction
            double direction = Math.random();
            if      (direction < 0.25) y++; // north
            else if (direction < 0.50) y--; // south
            else if (direction < 0.75) x++; // east
            else if (direction < 1)    x--; // west

            // calculates and updates the Manhattan distance value
            dist = Math.abs((origin - x)) + Math.abs((origin - y));

            // increments steps total
            steps++;

            // prints out coordinates in (x, y) formatting
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
