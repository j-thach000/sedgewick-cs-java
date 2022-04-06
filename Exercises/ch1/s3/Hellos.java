public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i=1; i <= n; i++) {
            if (i % 10 == 0) System.out.println(i + "th Hello");
            else if (i % 100 == 11) System.out.println(i + "th Hello");
            else if (i % 100 == 12) System.out.println(i + "th Hello");
            else if (i % 100 == 13) System.out.println(i + "th Hello");
            else if (i % 10 == 1) System.out.println(i + "st Hello");
            else if (i % 10 == 2) System.out.println(i + "nd Hello");
            else if (i % 10 == 3) System.out.println(i + "rd Hello");
            else if (i % 10 >= 4) System.out.println(i + "th Hello");
        }
    }
}
