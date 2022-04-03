public class BMI {
    public static void main(String[] args) {
        double weight = Integer.parseInt(args[0]);
        double height = Integer.parseInt(args[1]); // user inputs in inches

        // formula assumes the inputs are in imperial units
        int bmi = (int) ((weight) / (Math.pow(height, 2)) * 703);

        System.out.println("BMI: " + bmi);
    }
}
