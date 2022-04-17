public class Swap {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };

        for (int x = 0; x < a.length; x++) System.out.println(a[x]);

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        for (int y = 0; y < a.length; y++) System.out.println(a[y]);
    }
}
