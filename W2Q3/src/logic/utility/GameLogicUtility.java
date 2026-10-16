package logic.utility;

import java.util.ArrayList;
import logic.card.BaseCard;
import logic.game.GameLogic;

public class GameLogicUtility {
private static GameLogicUtility instance = null;
	
	
	public static GameLogicUtility getInstance() {
		if(instance == null) {
			instance = new GameLogicUtility();
		}
		return instance;
	}
	
    public static boolean drawRule(){
        for(BaseCard c : GameLogic.getInstance().getHand()){
            if (c.ruleCheck()){
                return false;
            }
        }
        return true;
    }
    
}
