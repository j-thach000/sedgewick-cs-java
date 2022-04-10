public class RandomWalkers {
    public static void main(String[] args) {
        // desired Manhattan distance
        int r = Integer.parseInt(args[0]);

        // desired trials to run RandomWalker
        int trials = Integer.parseInt(args[1]);

        // assigns walker starting point and prints it
        int origin = 0;

        // current value of steps taken
        int stepsTotal = 0;

        for (int i = 1; i <= trials; i++)
        { // loop continues until all trials are run
            int dist = 0; // current value of the Manhattan distance
            int steps = 0; // steps in the current trial

            // current coordinates of the walker
            int x = 0;
            int y = 0;

            while (dist < r)
            { // loop continues until Manhattan distance is equal to the input
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
            }

            stepsTotal += steps;
        }
        int stepsAverage = stepsTotal / trials;
        System.out.println("average number of steps = " + stepsAverage);
    }
}
