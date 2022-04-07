public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i=1; i<=n; i++) { // outer loop that controls current column
            for (int j=1; j<=n; j++){ // inner loop that indicates row
                int dist = Math.abs((j - i)); // cell's distance from diagonal
                if ((dist == 0) || (dist <= width)) System.out.print("*  ");
                else                                System.out.print("0  ");
                if (j == n)                         System.out.println();
            }
        }

    }
}
