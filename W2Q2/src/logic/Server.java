package logic;

import java.util.Objects;
import java.util.ArrayList;
public class Server {
	public String name; 
	public User owner;
	public ArrayList<Channel> channelList;
	public ArrayList<User> memberList;
	
	public Server(String name, User owner, TemplateType t) {
		this.owner = owner;
		this.memberList = new ArrayList<User>();
		this.channelList = new ArrayList<Channel>();
		addUser(owner);
		setName(name);
		String p = "";
		if(t==TemplateType.BASIC) {
			 p = "general";
		}
		if(t==TemplateType.GAMING) {
			 p = "gaming";
		}
		if(t==TemplateType.STUDY) {
			 p = "homework-help";
		}
		
		
		addChannel(owner,p);
		
	}
	public Channel addChannel(User user, String channelName) {
		if(this.owner == user) {
			Channel k =  new Channel(channelName);
			this.channelList.add(k);
			return k;
		}
		else {
			
		return null;
		}
	}
	public boolean isMemberInServer(User k){
		return memberList.contains(k);
	}
	public User addUser(User u) {
		if (!memberList.contains(u)) {
			memberList.add(u);
			u.addJoinedServersList(this);
			return u;
		}
		else {
			return null;
		}
	}
	public boolean kickUser(User kicker,User kicked) throws Exception{
		if (kicker != owner) {
			throw new Exception("");
		}
		else {
			if (kicked==owner | !memberList.contains(kicked)) {
				return false;
			}
			else {
				memberList.remove(kicked);
				kicked.getJoinedServersList().remove(this);
				return true;
		}
		
		}
	}
	public void setName(String name) {
		if(name.isBlank()) {
			name = owner.getName() + " home";
		}
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public User getOwner() {
		return owner;
	}
	public ArrayList<Channel> getChannelList(){
		return channelList;
	}
	public ArrayList<User> getMemberList(){
		return memberList;
	}

	
}