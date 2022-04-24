public class AboveAverage {
    public static void main(String[] args) {
        int AVERAGE = Integer.parseInt(args[0]); // average
        int aboveAverage = 0; // array values above average

        for (int i = 1; i < args.length; i++)
        { // converts array value to int and compares against average
            int x = Integer.parseInt(args[i]);
            if (x > AVERAGE) aboveAverage++;
        }

        System.out.println("Average      : " + args[0]);
        System.out.print("Above Average: ");
        System.out.println(aboveAverage + " / " + (args.length - 1));
    }
}
