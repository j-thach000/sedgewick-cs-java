public class SpringSeason {
    public static void main(String[] args) {
        int MARCH = 3;
        int APRIL = 4;
        int MAY = 5;
        int JUNE = 6;

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        // Boolean logic that checks if the values are within a month and match
        boolean isSpring;
        isSpring = (d >= 20) && (d <= 31) && (m == MARCH)
                || (d >= 1) && (d <= 30) && (m == APRIL)
                || (d >= 1) && (d <= 31) && (m == MAY)
                || (d >= 1) && (d <= 20) && (m == JUNE);

        System.out.println(isSpring);
    }
}
