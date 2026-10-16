package logic;

import java.util.Objects;
import java.util.ArrayList;

public class Channel{
	
	public String name;
	public ArrayList<Message> messageList;
	
	public Channel(String name) {
		this.messageList = new ArrayList<Message>();
		setName(name);
	}
	public void addMessage(Message msg) {
		messageList.add(msg);
	}
	public void setName(String n) {
		if (n.isBlank()) {
			n = "off-topic";
		}
		this.name = n;
	}
	public int getMessageCount() {
		return messageList.size();
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Message> getMessageList(){
		return this.messageList;
	}
	
}