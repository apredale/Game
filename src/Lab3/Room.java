package Lab3;

import java.util.HashMap;

public class Room {
	private String desc;
	private Room east;
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private HashMap<String, Item> item = new HashMap<String, Item>();
	
	public Room(String n) {
		 desc = n;
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
	
	
	
	
	
	
}
