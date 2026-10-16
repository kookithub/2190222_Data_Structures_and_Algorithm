package logic;

public class CardCounter {
	
	private UnitCard card;
	private int count;
	
	public String toString() {
		return  this.getCard() + " x " + this.getCount();
	}
	public CardCounter(UnitCard card, int count) {
	      this.card = card;
	      this.setCount(count);
	   }

	 public void setCount(int count) {
	      if (count < 0) {
	         count = 0;
	      }
	
	      this.count = count;
	   }
	
	   public int getCount() {
	      return this.count;
	   }
	
	   public void setCard(UnitCard card) {
	      this.card = card;
	   }
	
	   public UnitCard getCard() {
	      return this.card;
	   }
	}

