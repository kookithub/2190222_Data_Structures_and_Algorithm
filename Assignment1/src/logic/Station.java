package logic;

public class Station {
 private String nstationname;
 private int i;
 
 public Station(String string, int i) {
  this.nstationname = string;
  this.i = i;
 }
 public String getName() {
  return nstationname;
 }
 public int getNumber() {
  return i;
 }
 public void setName(String name) {
	  this.nstationname = name;
	 }
	 public void setNumber(int i) {
	  this.i = i;
	 }
}
