public class CarLoan {
    public static void main(String[] args) {
        double P = Integer.parseInt(args[0]); // dollar loan amount
        double R = Integer.parseInt(args[1]); // % interest compounded monthly
        double Y = Integer.parseInt(args[2]); // years to pay beck

        double n = 12 * Y;
        double r = (R / 100) / 12;

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        System.out.println("Monthly Payment: " + payment);
    }
}
