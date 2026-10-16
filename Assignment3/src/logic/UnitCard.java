package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;

	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}
	public UnitCard(String n, int bc, int p, int h, String ft) {
	      setName(n);
	      setBloodCost(bc);
	      setPower(p);
	      setHealth(h);
	      setFlavorText(ft);
	   }

	   public void setName(String n) {
	      if (n.isBlank()||n==""|n==null) {
	         n = "Creature";
	      }

	      this.name = n;
	   }

	   public void setHealth(int n) {
	      if (n < 1) {
	         n = 1;
	      }

	      this.health = n;
	   }

	   public void setPower(int n) {
	      if (n < 0) {
	         n = 0;
	      }

	      this.power = n;
	   }

	   public void setBloodCost(int n) {
	      if (n < 0) {
	         n = 0;
	      }

	      this.bloodCost = n;
	   }
	   public void setFlavorText(String n) {
		      this.flavorText = n;
		   }

	   public boolean equals(UnitCard other) {
	      return this.name == other.getName();
	   }

	   public String getName() {
	      return this.name;
	   }

	   public int getPower() {
	      return this.power;
	   }

	   public int getBloodCost() {
	      return this.bloodCost;
	   }

	   public int getHealth() {
	      return this.health;
	   }

	   public String getFlavorText() {
	      return this.flavorText;
	   }

}
