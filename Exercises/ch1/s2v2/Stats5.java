public class Stats5 {
    public static void main(String[] args) {
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
        double rand4 = Math.random();
        double rand5 = Math.random();
        System.out.println("Generated Numbers: ");
        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);
        System.out.println(rand5);

        double min = Math.min(rand1, Math.min(rand2, Math.min(rand3, Math.min(rand4, rand5))));
        double max = Math.max(rand1, Math.max(rand2, Math.max(rand3, Math.max(rand4, rand5))));
        double average = (rand1 + rand2 + rand3 + rand4 + rand5) / 5;
        System.out.println("average = " + average);
        System.out.println("min     = " + min);
        System.out.println("max     = " + max);
    }
}
