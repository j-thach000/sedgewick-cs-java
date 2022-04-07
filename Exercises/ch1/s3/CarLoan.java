public class CarLoan {
    public static void main(String[] args) {
        double Principal = Integer.parseInt(args[0]); // dollar loan amount
        double Rate = Integer.parseInt(args[1]); // interest rate
        double Years = Integer.parseInt(args[2]); // years to pay beck

        double n = 12 * Years; // payment periods
        double r = (Rate / 100) / 12; // monthly interest rate in percent

        double payment;
        if (Rate == 0) payment = (Principal / n) / (1 - Math.pow(1 + r, -n));
        else           payment = (Principal * r) / (1 - Math.pow(1 + r, -n));

        double interest = payment * n - Principal;

        System.out.println("Monthly Payment: " + payment);
        System.out.println("Total Interest : " + interest);
    }
}
