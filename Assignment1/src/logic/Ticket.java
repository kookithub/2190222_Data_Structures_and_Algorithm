package logic;

public class Ticket {
 private int type;
 private int priceperstation;
 
 private Station start;
 private Station end;
 
 public Ticket(int type,Station start,Station end) {
  setType(type);
  setStation(start,end);
 }
 
 public int getType() {
  return type;
 }
 
 public int getPricePerStation() {
  return priceperstation;
 }
 
 public Station getStart() {
  return start;
 }
 
 public Station getEnd() {
  return end;
 }
 
	 public void setType(int type) {
	  if(type<0 || type>2 || type==1) {
	   this.type = 1;
	   this.priceperstation = 30;
	  }else if(type == 0){
	   this.type = 0;
	   this.priceperstation = 30;
	  }else if(type == 2){
	   this.type = 2;
	   this.priceperstation = 25;
	  }
	 }
 
 public void setStation(Station start,Station end) {
  this.start = start;//?
  this.end = end;//?
 }
 
 public double calculatePrice() {
  if(isStationValid(this.start,this.end)) {
   if(this.type==0) {
    if(getStationDistance(this.start,this.end) > 4) {
     return 0.8*(this.priceperstation * getStationDistance(this.start,this.end));
    }else {return this.priceperstation * getStationDistance(this.start,this.end);}
   }else if(type == 1) {
    return this.priceperstation * getStationDistance(this.start,this.end);
   }else if(type == 2) {
    return 0.6*this.priceperstation * getStationDistance(this.start,this.end);
   }else {
    return -1;
   }
 }else {return -1;}
 }
 
 public String getDescription() {
  String typename;
  
  switch(type) {
  
  case 0:
   typename = "Student";
   break;
  case 1:
   typename = "Adult";
   break;
  case 2:
   typename = "Elderly";
   break;
  default:
   typename = "Invalid";
  }
  
  return typename+" Ticket, from "+this.start+" to "+this.end;
 }
 
 public boolean isStationValid(Station start,Station end) {
  if (type == 2 && this.getStationDistance(start, end) > 6) {
   return false;
  }

  if (start == end || start.getName().equals(end.getName())) {
   return false;
  }
  return true;
 }
 
 public int getStationDistance(Station start,Station end) {
  return Math.abs(start.getNumber()-end.getNumber());
 }
 
}
