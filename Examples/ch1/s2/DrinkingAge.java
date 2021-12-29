public class DrinkingAge {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        boolean legal;
        legal = (age >= 21);
        System.out.println(legal);
    }
}
