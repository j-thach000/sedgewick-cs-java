public class DeckOfCards {
    public static void main(String[] args) {
        // set array values at compile time
        String[] rank =
            {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Jack", "Queen", "King", "Ace"
            };
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] deck = new String[52];

        for (int i = 0; i < 13; i++)
        { // populate the array with the card's rank and suit
            for (int j = 0; j < 4; j++)
            {
                deck[4*i + j] = rank[i] + " " + suit[j];
            }
        }

        for (int x = 0; x < 52; x++)
        {
            System.out.println(deck[x]);
        }


    }
}
