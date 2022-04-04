public class RollLoadedDie {
    public static void main(String[] args) {
        // double in the random of [0.0, 1.0)
        // implication is that it's inclusive of 0 and not including 1
        double r = Math.random();

        // print 1-5 with a probability of 1/8 and 6 with 3/8
        int roll;
        if (r < 1.0/8.0) roll = 1;
        else if (r < 2.0/8.0) roll = 2;
        else if (r < 3.0/8.0) roll = 3;
        else if (r < 4.0/8.0) roll = 4;
        else if (r < 5.0/8.0) roll = 5;
        else                  roll = 6;

        System.out.println(roll);
    }
}
