package logic;

import java.util.ArrayList;

public class Database {
    ArrayList<Player> playerList;
    ArrayList<Region> regionList;

    public  Database() {
        this.playerList = new ArrayList<Player>();
        this.regionList = new ArrayList<Region>();
    }
    public  Database(ArrayList<Player> playerList,ArrayList<Region> regionList){
        this.playerList = playerList;
        this.regionList = regionList;
    }
    public Player addPlayer(String name, Region region) throws Exception{
        Player p = new Player(name);
        for(Player r:playerList) {
        	if(r.getName()==name) {
        		throw new Exception("Cannot Add new Player");
        	}
        }
        playerList.add(p);
        region.addPlayerToRegion(p);
        return p;
    }
    public boolean addRegion(String name){
        Region p = new Region(name);
        for( Region r:regionList) {
        	if(r.getName()==name) {
        		return false;
        	}
        }
        regionList.add(p);
        return true;
        
    }
    public Region getRegionByName(String name){
        for(Region r:regionList){
            if(r.getName()==name){
                return r;
            }
        }
        return null;
    }
    public void addQuest(Player author, Region region, String name, String description){
        Quest q  = new Quest(author, region, name, description);
        region.addQuestToRegion(q);
    }

    public ArrayList<Player> getPlayerList(){
        return this.playerList;
    }
    public ArrayList<Region> getRegionList(){
        return this.regionList;
    }
}
