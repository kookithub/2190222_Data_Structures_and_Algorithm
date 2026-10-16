package logic;
public class Item{
    String name;
    int pricePerPiece;

    public Item(String name, int ppp){
        this.name = name;
        if(ppp<1){
            ppp= 1;
        }
        this.pricePerPiece = ppp;
    }

    public void setPricePerPiece(int ppp){
        if(ppp<1){
            ppp= 1;
        }
        this.pricePerPiece = ppp;
    }

    public int getPricePerPiece(){
        return this.pricePerPiece;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}