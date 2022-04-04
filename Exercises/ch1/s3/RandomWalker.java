public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        while (Math.abs(x + y) < r)
        { // prints coordinates of random steps until the walker is a Manhattan
          // distance r away from the starting point
            int direction = 4;
            int rng = (int) (Math.random() * direction);

            if (rng == 3) x++; // east
            if (rng == 2) x--; // west
            if (rng == 1) y++; // north
            if (rng == 0) y--; // south

            steps++;

            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}
