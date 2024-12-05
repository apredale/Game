package Lab3;

public class World {
public static Room buildWorld() {
	Room room1 = new Room("You are in room 1.");
	Room room2= new Room("you are in room 2.") ;
	Room room3= new Room("you are in room 3.") ;
	Room room4= new Room("you are in room 4.") ;
	Room room5= new Room("you are in room 5.") ;
	Room room6= new Room("you are in room 6 .") ;
	
	room1.addExit('e',room2);
	room2.addExit('w',room3);
	room3.addExit('n',room4);
	room4.addExit('s',room5);
	room5.addExit('u',room6);
	room6.addExit('d',room1);
	
	Item a =  new Item("desk","you can block off a room with this");
	Item b = new Item("Phone","Small metal box that produces light");
	Item c = new Item("pencil", "can only see invetory if you can right it down");
	Item d = new Item("Map"," you can find a key in room 3");
	Item e = new Item("flashlight","black stick that emits light");
	Item f = new Item("teleporter","you automaticaly travel to room5");
	Item g = new Item("diamond","siny valuable rock");
	NPC h = new NPC("Puppy","a puppy wags his tail");
	room1.setItem("Pencil",c);
	room1.setItem("Phone",b);
	room1.setItem("desk", a);
	room1.setItem("Map", d);
	room2.setNPC("Puppy",h);
	
	Safe safe = new Safe("safe","I wonder whats inside");
	room1.setItem("safe", safe);
	Combination combo = new Combination("safe combo", "12345");
	
	room1.setlock(true);
	
	

	return room1;
	}



}

