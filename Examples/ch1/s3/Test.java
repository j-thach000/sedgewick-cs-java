public class Test {
    public static void main(String[] args) {
        int sum = 0;

        for (int counter = 12; counter > 0; counter = counter - 2) sum = sum + counter;

        System.out.println(sum);
    }
}
