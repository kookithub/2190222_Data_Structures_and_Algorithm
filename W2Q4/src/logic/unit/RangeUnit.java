package logic.unit;

import java.util.ArrayList;

public class RangeUnit extends BaseUnit{
	public RangeUnit(int r,int c, boolean iw, String n) {
		super(r,c,iw,n);
		this.power = 1;
		this.isFlying = false;
		sethp(2);
	}
	public void attack(ArrayList<BaseUnit> tgp) {
		for (BaseUnit f:tgp) {
			if(this.isWhite()) {
				if((f.getRow() == this.row+1 && f.getColumn() == this.column)) {
					System.out.println(this.getName() + " attacks " + f.getName());	
					f.sethp(f.getHp()-this.power);
				}
			}
			else {
				if((f.getRow() == this.row-1 && f.getColumn() == this.column)) {
					System.out.println(this.getName() + " attacks " + f.getName());
					f.sethp(f.getHp()-this.power);
				}
			}
		}
	}

}
