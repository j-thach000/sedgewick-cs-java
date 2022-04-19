public class Deal {
    public static void main(String[] args) {

        int CARDS_PER_PLAYER = 5;

        // input for how many players to deal in
        int n = Integer.parseInt(args[0]);

        // set rank and suit array contents
        String[] rank =
                {
                        "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "Jack", "Queen", "King", "Ace"
                };
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // populate the deck array
        String[] deck = new String[52];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
                deck[13*i + j] = rank[j] + " of " + suit[i];

        // shuffle the deck
        for (int i = 0; i < deck.length; i++)
        {
            int r = i + (int) (Math.random() * (52-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }

        // deal n hands with 5 cards each
        for (int i = 0; i < n * CARDS_PER_PLAYER; i++)
        {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }

    }
}
