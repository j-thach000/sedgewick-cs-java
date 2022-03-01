public class PowerTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int power = 1;
        // dividing by 2 gets us near a power of 2 that's less than n
        while (power <= n/2) {
            power = 2 * power;
        }
        System.out.println(power);
    }
}
