package cardtrick;

/**
 *
 * @author rajpa
 */
public class Card 
{
    private int numbers;
    private String suit;
    
    public static final String[] SUITS = {"diamonds","spades","clubs","hearts"};

    /**
     * @return the numbers
     */
    public int getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    
}
