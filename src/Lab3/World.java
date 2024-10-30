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
	
	Item a =  new Item("desk","table");
	Item b = new Item("Phone","Small metal box that produces light");
	Item c = new Item("pencil", "small wooden stick");
	Item d = new Item("Map"," Paper with directions out");
	Item e = new Item("flashlight","black stick that emits light");
	room1.setItem("Pencil",c);
	room1.setItem("Phone",b);
	room1.setItem("desk", a);
	room1.setItem("Map", d);
	
	

	return room1;
	}



}

