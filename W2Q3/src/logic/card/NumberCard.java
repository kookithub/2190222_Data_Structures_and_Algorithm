package logic.card;

import logic.game.*;

public class NumberCard extends BaseCard{
	
	public NumberCard(CardColor c, CardSymbol s) {
		super(c);
		this.symbol = s;
	}
	public void play() {
 		GameLogic.getInstance().setTopCard(this);
	}
	public boolean ruleCheck() {
		if(this.color == GameLogic.getInstance().getTopCard().getColor() || this.symbol == GameLogic.getInstance().getTopCard().getSymbol()) {
			return true;
		}
		else {
			return false;
		}
	}
}
