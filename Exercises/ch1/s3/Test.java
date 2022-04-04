public class Test {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
        { // Print n asterisks
            for (int x = 1; x <= n; x++)
            {
                if (i == x)
                    System.out.print("*  ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
