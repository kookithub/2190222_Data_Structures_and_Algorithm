package logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	
	public Order() {
		orderItemList = new ArrayList<OrderItem>();
		orderNumber = totalOrderCount;
		totalOrderCount++;
	}

	public OrderItem addItem(Item item, int amount) {
		int k = 0;
		if (amount<0) {
			amount = 0;
		}
		for(OrderItem i : orderItemList){
			if(i.getItem()==item){
				i.increaseItemAmount(amount);
				k++;
			}
		}
		if(k==0){
				orderItemList.add(new OrderItem(item, amount));
			}
				
		return null;
		
	}

	public int calculateOrderTotalPrice() {
		int t = 0;
		for(OrderItem i : orderItemList){
			t = t+(i.calculateTotalPrice());
		}
		return t;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	
	
}
