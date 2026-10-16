package logic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UnitDeck{
    public ArrayList<CardCounter> cardsInDeck;
    String deckName;

    public UnitDeck(String deckName) {
        setDeckName(deckName);
        this.cardsInDeck = new ArrayList<CardCounter>();
    }

    public String getDeckName() {
        return deckName;
    }
    public void setDeckName(String deckName) {
        if (deckName == null || deckName.isBlank()) {
            deckName = "Untitled Deck";
        }
        this.deckName = deckName;
    }
    public ArrayList<CardCounter> getCardsInDeck() {
        return cardsInDeck;
    }
    public void setCardsInDeck() {
        this.cardsInDeck = new ArrayList<CardCounter>();
    }
    public void addCard(UnitCard newCard, int count) {
    	int j = 0;
        if (count >= 1){
            	for(CardCounter i:cardsInDeck) {
            		if(i.getCard()== newCard) {
            			i.setCount(i.getCount()+count);
            			j++;
            			break;
            		}}
        if(j==0) {
        	  
              
        	 cardsInDeck.add(new CardCounter(newCard,count));
        }
        }}
    ///int index = cardsInDeck.indexOf(newCard);
    ///CardCounter existingCard = cardsInDeck.get(index);
    ///int k = existingCard.getCount() ;
    ///existingCard.setCount(k + count);

    public void removeCard(UnitCard toRemove, int c){
    	 if ((c>=1)) {
    		 for(CardCounter i:cardsInDeck) {
    			 if(i.getCard()== toRemove) {
    				 if(i.getCount()<=c) {
    					 
            				this.cardsInDeck.remove(i);
            				
            				break;
            			}
    				 else {
 	        			i.setCount(i.getCount()-c);
 	        			break;
         		}
         		
           	}
          
          
          }
    	 }
       
    }
    public int cardCount(){
        int c = 0;
        for(CardCounter i:cardsInDeck){
            c += i.getCount();
        }
        return c;
    }
    public boolean existsInDeck(UnitCard card){
    	for(CardCounter i:cardsInDeck) {
    		if(i.getCard()== card) {
    			return true;
    		}}
    	return false;}
 
    public boolean equals(UnitDeck other){
        return this.deckName==(other.getDeckName());
    }
    
    
}