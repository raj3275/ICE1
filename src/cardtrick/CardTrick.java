/*
Student Name: Raj Patel
Student Number: 991637898
*/
package cardtrick;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rajpa
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {                
        
        Card[] magicHand = new Card[7];
        for (int i=0;i<magicHand.length;i++)
        {        
            Card c= new Card();
            c.setNumbers((int)(1+Math.random()*13));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;        
        }

        Scanner k = new Scanner(System.in);

        System.out.println("Enter card number > 1 to 13");
        int number = k.nextInt();
        System.out.println("Enter card SUIT > spades, clubs, diamonds, hearts");
        String suit = k.next();

        int found = 0;
        for(int i=0;i<magicHand.length;i++)
        {
            if (number==magicHand[i].getNumbers()){
                if (suit.equals(magicHand[i].getSuit())){
                    found = 1;
                }
            }
        }
        if(found==1)
            System.out.println("Your Card is found!");
        else
            System.out.println("Your Card is not found!");
      }
    
    Card luckyCard = new Card();
    luckyCard.setNumbers(3);
    luckyCard.setSuit("spades");
    
    int foundlc = 0;
        for(int i=0;i<magicHand.length;i++)
        {
            if (luckyCard.getNumbers()==magicHand[i].getNumbers()){
                if (luckyCard.getSuit().equals(magicHand[i].getSuit())){
                    foundlc = 1;
                }
            }
        }
        if(foundlc==1)
            System.out.println("Lucky Card is found!");
        else
            System.out.println("Lucky Card is not found!");
      }
    
}
