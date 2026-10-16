package logic;

import java.util.ArrayList;
import java.lang.Math;
public class Region {
    ArrayList<Player> playerList;
    String name;
    ArrayList<Quest> questList;
    
    public Region (String name){
        setName(name);
        this.playerList = new ArrayList<Player>();
        this.questList = new ArrayList<Quest>();
    }
    public void setName(String name){
        if (name.isBlank()){
            name = "Nowhere";
        }
        this.name = name;
    }
    public int getPlayerCount(){
        return playerList.size();
    }
    public double getRegionRank(){
        int c = 0;
        for(Player p : playerList){
            c += p.getRank();
        }
        double k = Math.round(c*100/(playerList.size()));
        return k/100;
    }
    public ArrayList<Quest> getAvailableQuests(Player viewer){
        ArrayList<Quest> a = new ArrayList<Quest>();
        for(Quest q:questList){
        if (q.getStatus() == Status.AVAILABLE && viewer != q.getAuthor() ) {
                a.add(q);
                
            }

        }
        return a;
    }
    public void addPlayerToRegion(Player p){
        this.playerList.add(p);
    }
    public void addQuestToRegion(Quest q){
        questList.add(q);
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Player> getPlayerList(){
        return this.playerList;
    }
    public ArrayList<Quest> getQuestList(){
        return this.questList;
    }
    public void setPlayerList( ArrayList<Player> q){
        this.playerList =  q;
    }
    public void setQuestList( ArrayList<Quest> q){
        this.questList =  q;
    }



}   
