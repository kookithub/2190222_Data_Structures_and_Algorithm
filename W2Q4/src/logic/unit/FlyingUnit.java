package logic.unit;

public class FlyingUnit extends BaseUnit{
	public FlyingUnit(int r,int c, boolean iw, String n) {
		super(r,c,iw,n);
		this.power = 1;
		this.isFlying = true;
		sethp(2);
	}
	public boolean move(int d) {
		if(d==0) {
			if(row<3) {
				this.row = getRow() + 2;
				return true;
			}
		}
		if(d==2) {
			if(row>1) {
				this.row = getRow() - 2;
				return true;
			}
		}
		if(d==3) {
			if(column>1) {
				this.column = getColumn() - 2;
				return true;
			}
		}
		if(d==1) {
			if(column< 3) {
				this.column = getColumn() + 2;
				return true;
			}
		}
		return false;
	}

}
