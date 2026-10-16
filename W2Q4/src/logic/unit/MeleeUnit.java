package logic.unit;

import java.util.ArrayList;

public class MeleeUnit extends BaseUnit{
	public MeleeUnit(int r,int c, boolean iw, String n) {
		super(r,c,iw,n);
		this.power = 2;
		this.isFlying = false;
		sethp(5);
	}
	public void attack(ArrayList<BaseUnit> tgp) {
		for (BaseUnit f:tgp) {
			if ((!f.isFlying()) && (f.getRow() == this.row && f.getColumn() == this.column)) {
				System.out.println( this.getName() + " attacks " + f.getName());
				f.sethp(f.getHp()-2);
				
			}
		}
	}

}
