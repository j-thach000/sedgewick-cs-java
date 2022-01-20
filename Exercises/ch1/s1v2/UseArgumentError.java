public class UseArgumentError {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");

        // java - used as argument
        // @!*^% - run error
        // 1234 - used as argument
        // .java Bob - run error
        // Alice Bob - only first argument is used
    }
}
