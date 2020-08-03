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
	  public void shuffle()
	  {
	    Random generator = new Random();
	    int j; // random index
	    for(int i=0;i<SIZE;i++)
	    {
	      j = generator.nextInt(SIZE);
	      
	    
	  }
	}
