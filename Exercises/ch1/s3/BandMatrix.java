public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 1; i <= n; i++)
        { // Print an n-by-n pattern with asterisks and zeroes.
            for (int x = 1; x <= n; x++)
            { // Print zeroes if the element's distance from the diagonal is
              // greater than the width, otherwise asterisks.
                int dist = Math.abs(x-i);
                if ((i == x) || (dist <= width))
                    System.out.print("*  ");
                else
                    System.out.print("0  ");
            }
            System.out.println();
        }
    }
}
