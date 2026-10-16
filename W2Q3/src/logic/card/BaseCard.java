package logic.card;
import logic.game.*;
public abstract class BaseCard {
	public CardColor color;
	public CardSymbol symbol;
	
	public BaseCard(CardColor color) {
		this.color = color;
	}
	public abstract void play();
	public abstract boolean ruleCheck();

	public CardColor getColor(){
		return this.color;
	}
	public CardSymbol getSymbol(){
		return this.symbol;
	}
	public void setCardColor(CardColor c) {
		this.color = c;
	}
	public void setCardSymbol(CardSymbol c) {
		this.symbol = c;
	}
	
}
