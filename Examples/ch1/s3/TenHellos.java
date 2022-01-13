public class TenHellos {
    public static void main(String[] args) {
        // Prints 10 hellos by using a while loop
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");
        // Using an initial index variable to track loop iterations
        int i = 4;
        while (i <= 10) {   // A loop that stops after the 10th hello
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}
