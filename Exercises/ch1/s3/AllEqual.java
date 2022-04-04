public class AllEqual {
    public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);

      // prints EQUAL and NOT EQUAL relative to the three arguments
      if ((a == b) && (b == c)) System.out.println("EQUAL");
      else                      System.out.println("NOT EQUAL");
    }
}
