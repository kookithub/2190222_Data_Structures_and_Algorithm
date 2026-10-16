package logic;

public class OrderItem {
    Item item;
    int itemAmount;
    
    public OrderItem(Item item, int itemAmount){
        this.item = item;
        if(itemAmount<0) {itemAmount=0;}
        this.itemAmount = itemAmount;
    }

    public void increaseItemAmount(int a){
        if (a<0){
            a = 0;
        }
        setItemAmount(itemAmount+a);
       
    }
    public int calculateTotalPrice(){
        return itemAmount*item.pricePerPiece;
    }
    public void setItemAmount(int ia){
    	if (ia<0) {
    		ia = 0;
    	}
        this.itemAmount= ia;
    }
    public Item getItem(){
        return item;
    }
    public int getItemAmount(){
        return itemAmount;
    }
}
