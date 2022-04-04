public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int steps = 0;

        for (int i = 0; i <= trials; i++)
        {
            int x = 0;
            int y = 0;

            while (Math.abs(x + y) < r)
            {
                int direction = 4;
                int rng = (int) (Math.random() * direction);

                if (rng == 3) x++; // east
                if (rng == 2) x--; // west
                if (rng == 1) y++; // north
                if (rng == 0) y--; // south

                steps++;
            }
        }
        System.out.println("average number of steps = " + (steps / trials));
    }
}
