public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Original A Value: " + a);
        int b = Integer.parseInt(args[1]);
        System.out.println("Original B Value: " + b);
        int c = 0;
        System.out.println("Original C Value: " + c);
        c = a;
        System.out.println("Swapped C Value: " + c);
        a = b;
        System.out.println("Swapped A Value: " + a);
        b = c;
        System.out.println("Swapped B Value: " + b);

        // biggest takeaway is that as we move further into the program
        // variables are potentially being updated with new values
    }
}
