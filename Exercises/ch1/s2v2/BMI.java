public class BMI {
    public static void main(String[] args) {
        double weight = Integer.parseInt(args[0]);
        double height = Integer.parseInt(args[1]);

        double BMI = (weight / (height * height)) * 703;

        System.out.println(Math.round(BMI));
    }
}
