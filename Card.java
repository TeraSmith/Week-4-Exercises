import java.util.Random;
public class Card {
	
	int faceValue;
	int suit;
	
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int SPADES = 3;
	public static final int CLUBS = 4;

		
		 public String toString()
		 {
		  String s = "";
		  switch (faceValue)
		  {
		   case 1: s+=" A";
		       break;
		   case 11:s+=" J";
		       break;
		   case 12:s+=" Q";
		       break;
		   case 13:s+=" K";
		       break;
		   case 10:s+="10";
		       break;
		   default:s+=" " + faceValue;
		       break;
		  }

		  switch (suit)
		  {
		   case HEARTS: s+='H';
		          break;
		   case DIAMONDS:s+='D';
		          break;
		   case CLUBS:  s+='C';
		          break;
		   case SPADES: s+='S';
		          break;
		  }

		  return s;
		 }
		}
	public class Deck
{
	  public static final int SIZE = 52;
	  private Card[] deckOfCards; //Contains all 52 cards

	  // Creates a normal Deck of 52 Cards
	  public Deck()
	  {
	    deckOfCards = new Card[SIZE];
	    int i=0;
	    for(int suit=1;suit<=4;suit++)
	    {
	      for(int face=1;face<=13;face++)
	      {
	        deckOfCards[i++] = new Card(face,suit);
	      }
	    }
	  }

	  // Returns Deck of Cards
	  public Card[] getDeckOfCards()
	  {
	    return deckOfCards;
	  }

	  // Shuffles a Deck of Cards randomly
	  public void shuffle()
	  {
	    Random generator = new Random();
	    Card temp; // store a number temporarily
	    int j; // random index to swap
	    for(int i=0;i<SIZE;i++)
	    {
	      j = generator.nextInt(SIZE);
	      temp = deckOfCards[i];
	      deckOfCards[i] = deckOfCards[j];
	      deckOfCards[j] = temp;
	    }
	  }
	}