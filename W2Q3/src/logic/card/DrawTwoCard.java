package logic.card;

import logic.game.*;

public class DrawTwoCard extends BaseCard{
    
    public DrawTwoCard(CardColor c) {
        super(c);
        this.symbol = CardSymbol.DRAW;
    }
    public void play() {
 		GameLogic.getInstance().setTopCard(this);
        GameLogic.getInstance().draw(2);
    }
    public boolean ruleCheck() {
        if(this.color == GameLogic.getInstance().getTopCard().getColor() ) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
