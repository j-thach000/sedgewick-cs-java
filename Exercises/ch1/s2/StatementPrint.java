public class StatementPrint {
    public static void main(String[] args) {
        System.out.println(2 + "bc"); // print 2bc
        System.out.println(2 + 3 + "bc"); // print 5bc
        System.out.println((2 + 3) + "bc"); // print 5bc
        System.out.println("bc" + (2 + 3)); // print bc5
        System.out.println("bc" + 2 + 3); // print bc5
        // guess was wrong due to order of precedence
        // just process the statement from left to right since there's no parentheses
        System.out.println("fiddlers " + 1);
    }
}
