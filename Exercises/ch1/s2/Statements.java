public class Statements {
    public static void main(String[] args) {
        int a = 1;
        int b = a;

        int t = a;
        b = t;
        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(t);

    }
}
