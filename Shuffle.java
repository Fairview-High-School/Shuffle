import java.util.List;
import java.util.ArrayList;

public class Shuffle
{
    public static void shuffle(List<String> elements)
    {
        //code to shuffle the List
    }
    
    public static void main(String[] args)
    {
        String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
        String[] ranks = new String[13];
        ranks[0] = "Ace";
        for (int i=2; i<=10; i++)
        {  ranks[i-1] = ""+i;  }
        ranks[10] = "Jack";
        ranks[11] = "Queen";
        ranks[12] = "King";
        
        List<String> deck = new ArrayList<>(); //note I am using the shortcut where I do not have to retype String in the constuctor <>
        
        //Write code to add all 52 cards to the deck
        
        shuffle(deck);
        
        //Write code to display the shuffled deck, one card per line
        
        
    }   
}
