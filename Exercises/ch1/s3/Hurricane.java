public class Hurricane {
    public static void main(String[] args) {
        // wind speed in miles per hour
        int speedWind = Integer.parseInt(args[0]);

        // checks hurricane speed for hurricane status
        if (speedWind < 74) System.out.println("Hurricane: No");
        else                System.out.println("Hurricane: Yes");

        // classifies hurricane category
        if      (speedWind < 96)  System.out.println("Category: 1");
        else if (speedWind < 111) System.out.println("Category: 2");
        else if (speedWind < 131) System.out.println("Category: 3");
        else if (speedWind < 156) System.out.println("Category: 4");
        else                      System.out.println("Category: 5");
    }
}
