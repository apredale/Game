package Lab3;
import java.io.*;
import java.util.HashMap;

public class Room implements Serializable {
	private String desc;
	private String name;
	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private boolean lock;
	
	

	public boolean getlock(){
		return lock;
	}
	public void setlock(boolean a) {
		lock = a;
	}
	private HashMap<String, Item> item = new HashMap<String, Item>();
	private HashMap<String, NPC> NPC = new HashMap<String, NPC>();
	public Room(String a) {
		 name = a;
		 Game.rooms.put(name,this);
	}
	public Room getExit(char n) {
		if (n == 'e') {
			return east;
		}
		else if(n =='w') {
			return west;
		}
		else if(n =='n') {
			return north;
		}
		else if(n =='s') {
			return south;
		}
		else if(n =='u') {
			return up;
		}
		else if(n =='d') {
			return down;
		}
		return null;
	}
	
	public void addExit(char a,Room b) {
		if(a == 'e') {
			east = b;
		}
		else if(a == 'w') {
			west = b;
		}
		else if(a == 'n') {
			north = b;
		}
		else if(a == 's') {
			south = b;
		}
		else if(a == 'u') {
			up = b;
		}
		else if(a == 'd') {
			down = b;
		}
		
	}
	
	public String toString() {
		return desc;
	}
	
	public void setItem(String a,Item b) {
		item.put(a, b);
	}
	public Item getItem(String a) {
		return item.get(a);
	}
	public void removeItem(String a) {
		item.remove(a);
	}
	public void setNPC(String a,NPC b) {
		NPC.put(a, b);
	}
	public NPC getNPC(String a ) {
		return NPC.get(a);
	}
	public void removeNPC(String a) {
		NPC.remove(a);
	}
	public String getName() {
		return name;
	}
	public void setName(String a) {
		name = a;
	}
	
	
	
	
	
}
