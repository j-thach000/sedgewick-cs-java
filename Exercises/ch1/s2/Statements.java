public class Statements {
    public static void main(String[] args) {

        int a, b;
        a = 1;
        b = 2;
        int before = (a + b);
        System.out.println(before);
        int t = a;
        a = b;
        b = t;
        int after = (a + b);
        System.out.println(after);

    }
}
