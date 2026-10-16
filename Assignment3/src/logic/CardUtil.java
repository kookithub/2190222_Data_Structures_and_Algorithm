package logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CardUtil {
	
	public static boolean isExistsInList(UnitCard card, ArrayList<UnitCard> list) {
		return (-1!=list.indexOf(card));

	}
	
	public static boolean isExistsInList(UnitDeck deck, ArrayList<UnitDeck> list) {	
		return (-1!=list.indexOf(deck));

	}
	
	public static boolean cardExistsInDeckList(ArrayList<UnitDeck> deckList, UnitCard cardToTest) {
		for(UnitDeck Deck:deckList) {
			for(CardCounter c:Deck.getCardsInDeck()) {
				if (c.getCard()==cardToTest) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static ArrayList<UnitCard> getCardsFromFile(String filename){
        try {
           File fileToRead = new File(filename);
           ArrayList<UnitCard> cardsFromFile = new ArrayList<UnitCard>();
           Scanner myReader = new Scanner(fileToRead);
           while (myReader.hasNextLine()) {
               String data = myReader.nextLine();
               String[] attributes = data.split(",");
               try {
                   UnitCard newCard = new UnitCard(attributes[0] , Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]),Integer.parseInt(attributes[3]) , attributes[4]);
                   cardsFromFile.add(newCard);
               }
               catch(Exception e)
               {
                   System.out.println("File contains string with incorrect format!");
                   myReader.close();
                   return null;
               }
           }
           myReader.close();
           return cardsFromFile;
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot find file!");            
            return null;
        }
   }

	public static void printCardList(ArrayList<UnitCard> cardList, boolean verbose) {
		
		for(int i = 0; i < cardList.size(); i++) {
			System.out.println(i + ") " + cardList.get(i));
			if(verbose) {
				System.out.println("Blood Cost: " + cardList.get(i).getBloodCost());
				System.out.println(cardList.get(i).getFlavorText());
				if(i < cardList.size()-1) System.out.println("-----");
			}
		}
	}
	
	public static void printDeck(UnitDeck ud) {
		
		if(ud.getCardsInDeck().size() == 0) {
			System.out.println("EMPTY DECK");
		}else {
			for(CardCounter cc : ud.getCardsInDeck()) {
				System.out.println(cc);
			}
		}
		
		System.out.println("Total Cards: " + ud.cardCount());
	}
	
	public static void printDeckList(ArrayList<UnitDeck> deckList) {
		
		
		for(int i = 0; i < deckList.size(); i++) {
			System.out.println(i + ") " + deckList.get(i).getDeckName());
			printDeck(deckList.get(i));
			if(i < deckList.size()-1) System.out.println("-----");
		}
	}
}
