package logic.unit;
import java.util.*;
public class BaseUnit {
	public int row ;
	public int column ;
	public boolean isWhite;
	public String name;
	public int hp;
	public int power;
	public boolean isFlying;
	
	public BaseUnit(int sc, int sr, boolean isWhite, String name){
		this.power = 1;
		this.isFlying = false;
		sethp(2);
		setRow(sr);
		setColumn(sc);
		this.isWhite = isWhite;
		this.name = name;
	}
	public boolean move(int d) {
		if(d==0) {
			if(row<4) {
				this.row = getRow() + 1;
				return true;
			}
		}
		if(d==2) {
			if(row>0) {
				this.row = getRow() - 1;
				return true;
			}
		}
		
		if(d==3) {
			if(column>0) {
				this.column = getColumn() - 1;
				return true;
			}
		}
		if(d==1) {
			if(column< 4) {
				this.column = getColumn() + 1;
				return true;
			}
		}
		return false;
	}
	public void attack(ArrayList<BaseUnit> tgp) {
		for (BaseUnit f:tgp) {
			if ((!f.isFlying()) && (f.getRow() == this.row && f.getColumn() == this.column)) {
				System.out.println( this.getName() + " attacks " + f.getName());
				f.sethp(f.getHp()-1);
				
			}
		}
	}
	
	
	public void setRow(int r){
		if(r<0) {
			r = 0;
		}
		if(r>4) {
			r = 4;
		}
		this.row = r;
	}
	public void setColumn(int r){
		if(r<0) {
			r = 0;
		}
		if(r>4) {
			r = 4;
		}
		this.column = r;
	}
	public void setisWhite(boolean b){
		this.isWhite = b;
	}
	public void setName(String r){
		this.name = r;
	}
	public void sethp(int r){
		this.hp = r;
	}
	public int getRow() {
	    return row;
	}

	public int getColumn() {
	    return column;
	}

	public boolean isWhite() {
	    return isWhite;
	}

	public String getName() {
	    return name;
	}

	public int getHp() {
	    return hp;
	}

	public int getPower() {
	    return power;
	}

	public boolean isFlying() {
	    return isFlying;
	}

	
	
}
