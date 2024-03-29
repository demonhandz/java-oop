package abstraction.cardsWithPower;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getCardName() {
        return rank.name() + " of " + suit.name();
    }

    public int getCardPower() {
        return rank.getPower() + suit.getPower();
    }
}
